#include<iostream>
using namespace std;

int main(){
	int n;
	cin >> n;
	int arr[n];
	for (int i = 0; i < n; i++)
	{
		cin >> arr[i];
	}
	
	// Input
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}
	cout << endl;
	
	// Selection Sort
	for(int i = 0; i < n-1; i++){
		for (int j = i + 1; j < n; j++){
			if(arr[i] > arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	// Output
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}
	cout << endl;
}
