#include <iostream>
using namespace std;

int a,b;

void swap (int i, int j){
    a = i;
    b = j;
    a = a + b;
    b = a - b;
    a = a - b;
}

int main (){
    cout << "Enter 1st Number : ";
    cin >> a;
    cout << "Enter 2nd Number : ";
    cin >> b;
    cout << "\nBefore Swapping : ";
    cout << "\nValue of A is " << a;
    cout << "\nValue of B is " << b;
    swap(a, b);
    cout << "\n\nAfter Swapping : ";
    cout << "\nValue of A is " << a;
    cout << "\nValue of B is " << b;
    cout << endl;
    return 0;
}