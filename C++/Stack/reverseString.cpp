#include<iostream>
#include<bits/stdc++.h>
#include<stack>
using namespace std;

int main(){
    string str = "adarsh";
    stack<char> s;
    for (int i = 0; i < str.length(); i++){
        char ch = str[i];
        s.push(ch);
    }
    for (int i = 0; i < str.length(); i++){
        cout << s.pop();
    }
    cout << endl;
    return 0;
}