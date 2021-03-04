#include<iostream>
using namespace std;

void decreasing(int n){

  if ( n == 0){
    return;
  }
  cout << n << " "; 
  decreasing(n - 1);
}


int main () {
    
  int n;
  cin >> n;

  decreasing(n);
  cout << endl;
  return 0;

 }
