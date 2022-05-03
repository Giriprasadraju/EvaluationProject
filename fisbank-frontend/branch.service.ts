import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class BranchService {

  constructor(private httpClient :HttpClient) { }

  getAllBranches()
  {
    return this.httpClient.get("http://localhost:8086/branch/all");
  }
}
