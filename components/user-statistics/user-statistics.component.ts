import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-statistics',
  templateUrl: './user-statistics.component.html',
  styleUrls: ['./user-statistics.component.css']
})
export class UserStatisticsComponent implements OnInit {
  userStatistics: any[] = [];

  constructor(private http: HttpClient) {}

  ngOnInit(): void {
    this.fetchUserStatistics();
  }

  fetchUserStatistics() {
    this.http.get('http://localhost:8080/api/user-statistics')
      .subscribe((data: any) => {
        this.userStatistics = data;
      });
  }
}
