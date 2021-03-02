#include<iostream>
#include<math.h>
using namespace std;

int main (){
    int n, i, sum = 0,d;
    cout << "Enter Binary Number : ";
    cin >> n;
    for (i = 0; n > 0; i++){
        d = n % 10;
        sum += d * pow(2, i);
        n /= 10;
    }
    cout << "Its Decimal Number is : " << sum;
    cout << endl;
    return 0;
}