#include<iostream>
using namespace std;
int main (){
	int n;
	cout << "Enter Number of Terms : ";
	cin >> n;
	// if (n == 1){
	// 	cout << 0;
	// }
	// else if ( n == 2 ){
	// 	cout << 0 << "\t" << 1;
	// }
	// else if ( n > 2 ){
	// int a = 0, b = 1;
	// cout << a << "   " << b;
	// int c;
	// while( n > 2){
	// cout << "   " << a+b;
	// c = a+b;
	// a = b;
	// b = c;
	// n--;	
	// }
	// }	
	int a = 0, b = 1, c;
	for (int i = 1; i <= n; i++){
		cout << a << "   ";
		c = a + b;
		a = b;
		b = c;
	}
	cout<<endl;
	return 0;
}
