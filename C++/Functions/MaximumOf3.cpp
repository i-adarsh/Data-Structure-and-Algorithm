#include<iostream>
using namespace std;

int maximum (int a, int b, int c){
	if ( a > b ){
		if ( a > c){
			return a;
		}
		if ( a < c){
			return c;
		}
	}
	else if ( b > c){
		return b;
	}
	else {
		return c;
	}
}

int minimum (int a, int b, int c){
	if ( a < b ){
		if ( a < c ){
			return a;
		}
		else {
			return c;
		}
	}
	else if ( b < c ){
		return b;
	}
	else {
		return c; 
	}
}

int main (){
	int a, b, c;
	cout << "Enter 1st Number : ";
	cin >> a;
	cout << "Enter 2nd Number : ";
	cin >> b;
	cout << "Enter 3rd Number : ";
	cin >> c;
	cout << "\nMaximum : " << maximum(a, b, c);
	cout << "\nMinimum : " << minimum(a, b, c);
	cout << endl;
	return 0;
}
