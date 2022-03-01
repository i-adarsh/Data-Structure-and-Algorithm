#include<iostream>
using namespace std;
int addNumber(int a, int b){
	return a+b;
}

int main (){
	int a,b;
	cout << "Enter 1st Number : ";
	cin >> a;
	cout << "Enter 2nd Number : ";
	cin >> b;
	cout << "The Sum is : " << addNumber(a, b);
	cout << endl;
	return 0;
}
