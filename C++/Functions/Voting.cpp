#include<iostream>
using namespace std;
void voting (int a){
	if ( a >= 18){
		cout << "\nYou're Elligible for Voting.";
	}
	else {
		cout << "\nYou're Not Elligible for Voting.";
	}
}

int main () {
	int a;
	cout << "Enter Your Age : ";
	cin >> a;
	voting(a);
	cout << endl;
	return 0;
}
