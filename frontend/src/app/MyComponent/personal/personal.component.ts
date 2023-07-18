import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-personal',
  templateUrl: './personal.component.html',
  styleUrls: ['./personal.component.css']
})
export class PersonalComponent {
  selectedFile: File | null = null;
  imageUrl: string | ArrayBuffer | null = null;

  constructor(private http: HttpClient) {}

  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
    this.previewImage();
}

previewImage() {
  const reader = new FileReader();
  reader.onload = () => {
    this.imageUrl = reader.result;
  };
  reader.readAsDataURL(this.selectedFile as Blob);
}

uploadImage() {
  const uploadData = new FormData();
  uploadData.append('image', this.selectedFile as Blob, this.selectedFile?.name);

  this.http.post<any>('http://localhost:8080/api/upload', uploadData).subscribe(
    (response) => {
      console.log('Image uploaded successfully.');
    },
    (error) => {
      console.error('Error uploading image:', error);
    }
  );
}
}
