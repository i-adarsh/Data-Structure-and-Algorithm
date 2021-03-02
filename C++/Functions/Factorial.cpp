#include<iostream>
using namespace std;

void factorial (int n){
	int fact = 1;
	while ( n > 0 ){
	fact = fact * n;
	n--;
	}
	cout << fact;	
}

int main (){
	int a; 
	cout << "Enter No. for Factorial : ";
	cin >> a;
	factorial(a);
	cout << endl;
	return 0;
}
