#include<iostream>
using namespace std;

int naturalSum(int n){
	return (n*(n+1))/2;
}

int main (){
	int a;
	cout << "Enter No. of Terms : ";
	cin >> a;
	cout << "Sum of 1st " << a << " Natural Number is : " << naturalSum(a); 
	cout << endl;
	return 0;
}
