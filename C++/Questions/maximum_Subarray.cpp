#include<iostream>
using namespace std;

int main () {


  int n;
  cin >> n;
  int arr[n];
  for (int i = 0; i< n; i++){
    cin >> arr[i];
  }
  int previous_diff = arr[1] - arr[0];
  int curr_subarray_len = 2;
  int ans;
  int j = 2;
  while (j < n){
    if (previous_diff == arr[j] - arr[j-1]){
      curr_subarray_len += 1; 
    }
    else {
      previous_diff = arr[j] - arr[j-1];
      curr_subarray_len = 2; 
    }
    ans = max(ans, curr_subarray_len);
    j++;
  }
  cout << ans << endl;
  return 0;
}
