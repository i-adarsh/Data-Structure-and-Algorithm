#include<iostream>
using namespace std;
int main (){
	int n, fact = 1;
	cout << "Enter Number for Factorial : ";
	cin >> n;
	while ( n > 0 ){
	fact = fact * n;
	n--;
	}
	cout << "Factorial is : "<<fact;	 
	cout << endl;
	return 0;
}

