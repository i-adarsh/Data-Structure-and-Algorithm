#include<iostream>
using namespace std;

int factorial(int n){
	int fact = 1;
	while (n > 0){
		fact *= n;
		n--;
	}
	return fact;
}

int binaryCoefficient(int n, int r){
	int ans = factorial(n)/(factorial(r)*factorial(n-r));
	return ans;
}
int main () {
	int n;
	cout << "Enter No. of Rows : ";
	cin >> n;
	for (int i = 0 ; i < n; i++){
		for (int j = 0; j <= i; j++){
		cout << binaryCoefficient(i, j) << "   ";
		}
		cout << "\n";
	}
	cout << endl;
	return 0;
}
