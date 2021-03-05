#include<iostream>
using namespace std;

int firstOcc(int arr[], int n, int i, int key){

  if (i == n){
    return -1;
  }

  if (arr[i] == key){
    return i;
  }

  return firstOcc(arr, n, i+1, key);

}

int main () {
  int arr[] = {1,4,2,5,6,7,8,3,5};
  int key = 0;
  cin >> key;
  cout << firstOcc(arr, 8, 0, key) << endl;
  return 0;
}
