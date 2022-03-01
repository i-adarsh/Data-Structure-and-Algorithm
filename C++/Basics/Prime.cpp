#include<iostream>
#include<cmath>
using namespace std;

int main(){
	int n;
    bool flag = 0;
    cout << "Enter a Number : ";
    cin >> n;
	for (int i = 2; i <= sqrt(n); i++){
		if ( n % i == 0){
            cout << "Not Prime";
			flag = 1;
            break;
        }
    }
    if (flag == 0){
		cout<<"It is Prime";
	}
	cout << endl;
	return 0;
}
