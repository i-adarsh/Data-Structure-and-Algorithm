#include<iostream>
using namespace std;

void increasing (int n, int a = 1){

  if ( a > n){
    return;
  }
  cout << a << " ";
  increasing(n, ++a);

 }

int main () {
  int n;
  cin >> n;
  increasing(n);
  return 0;
}
