#include<iostream>
using namespace std;

int main (){
    int rupees;
    cin >> rupees;

    int number_of_chocolates = rupees;
    int remainder = 0;
    while(rupees > 2){
        number_of_chocolates += rupees / 3;
        rupees = rupees / 3;
    }
    if (rupees > 0){
        number_of_chocolates += rupees;
    }
    cout << number_of_chocolates << endl;
    return 0;
}