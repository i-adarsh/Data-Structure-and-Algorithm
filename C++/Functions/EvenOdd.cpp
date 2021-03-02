#include<iostream>
using namespace std;

void oddEven (int n ){
	if ( n % 2 == 0){
		cout << "It is Even ";
	}
	else {
	cout << "It is Odd ";
	}
}

int main (){
	int a;
	cout << "Enter a Number : ";
	cin >> a;
	oddEven(a);
	cout << endl;
	return 0;
}
