#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int n,i, r,real, sum = 0,p = 0;
    cout << "Enter a Number : ";
    cin >> n;
    r = n;
    while(n > 0){
	p++;
	n /= 10;
	}
    n = r;
    real = n;
    r = 0;
    for (i = 0; n > 0; i++)
    {
        r = n % 10;
        sum += pow(r, p);
        n /= 10;
    }
    if (sum == real)
    {
        cout << "It is an Armstrong Number : ";
    }
    else{
    cout<<"It is not an Armstrong Number ";
    }
    cout<<endl;
    return 0;
}
