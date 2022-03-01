#include<iostream>
using namespace std;

void isAlphabet(char ch){
	if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
		cout << "It is an Aplhabet";
	}
	else{
		cout << "It is not an Alphabet";
	}	  
}


int main (){
	char ch;
	cout << "Enter an Character : ";
	cin >> ch;
	isAlphabet(ch);
	cout << endl;
	return 0;
}
