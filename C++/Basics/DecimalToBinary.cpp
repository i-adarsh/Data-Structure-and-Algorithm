#include<iostream>
#include<math.h>
using namespace std;

int main (){
int n, i, d;
long sum = 0;
cout<<"Enter Decimal Number : ";
cin >> n;
for (i = 0; n > 0; i++){
d = n % 2;
sum += d * pow(10, i);
n /= 2;
}
cout<<"Its Binary Equivalent is : "<<sum;
cout<<endl;
return 0;
}
