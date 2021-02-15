#include<iostream>
using namespace std;
int main (){
	char ch;
	cout << "Enter an Alphabet : ";
	cin >> ch;
	if ( ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U' ){
	cout << "It is Vowel";
	}
	else{
	cout << "It is Consonant.";
	}
	cout << endl;
	return 0;
}
