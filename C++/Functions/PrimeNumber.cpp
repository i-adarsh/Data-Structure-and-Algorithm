#include<iostream>
#include<cmath>
using namespace std;

void isPrime(int a){
	int i;
	bool flag = 0;
	for (i = 2; i <= sqrt(a); i++){
		if (a % i == 0){
		flag = 1;
		break;
		}
	} 
	if (flag == 0){
		cout << a << "   ";
	}	
}

int main (){
	int a, b;
	cout << "Starting Range : ";
	cin >> a;
	cout << "Ending Range : ";
	cin >> b;
	while ( a != b){
		isPrime(a);
		a++;
	}
	cout << endl;
	return 0;
}
