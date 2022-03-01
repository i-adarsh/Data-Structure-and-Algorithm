#include<iostream>
#include<cmath>
using namespace std;

void checkPythagorian(int x, int y, int z){
	int a = max(x, max(y,z));
	int b,c;
	if (a == x){
		b = y;
		c = z;
	}
	else if (a == y){
		b = x;
		c = z;
	}
	else {
		a = z;
		b = x;
		c = y;
	}
	if (a*a == b*b + c*c){
		cout << "It is Pythagorian Triplet.";
	}
	else {
		cout << "It is Not Pythagorian Triplet.";
	}
}

int main (){
	int a, b, c;
	cout << "Enter 1st Side : ";
	cin >> a;
	cout << "Enter 2nd Side : ";
	cin >> b;
	cout << "Enter 3rd Side : ";
	cin >> c;
	checkPythagorian(a, b, c);
	cout << endl;
	return 0;
}
