#include<iostream>
using namespace std;

int divisible(int a, int b, int r){
    int c1 = r / a;
    int c2 = r / b;

    int c3 = r / (a * b);

    return c1 + c2 - c3;
}

int main (){
    int a, b, c;
    cin >> a >> b >> c;
    // 5 7 50
    cout << divisible(a,b,c) << endl;
    return 0;
}