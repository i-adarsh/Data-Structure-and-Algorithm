#include<iostream>
using namespace std;

int main(){
    int r = 0;
    cin >> r;
    int total = r;
    while( r > 3){
        int chocolate = (r/3);
        total += chocolate;
        r = r / 3;
    }
    cout << total + r << endl;
    return 0;
}