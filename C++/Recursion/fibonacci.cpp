#include<iostream>

using namespace std;

int fibonacci (int n){

  int a = 0, b = 1;
  if (n == 0 || n == 1){
    return n;
  }
  return fibonacci(n - 2) + fibonacci(n - 1);

}

int main (){

  int n;
  cin >> n;
  cout << fibonacci(n) << endl;
  return 0;

}

