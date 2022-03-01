#include<iostream>
#include<vector>
using namespace std;

int main (){
    vector<int> a;
    int n;
    cin >> n;
    for(int i = 0; i < n; i++){
        a.push_back(i);
    }
    cout << "Print: " << endl;
    for(auto i = a.begin(); i != a.end(); i++){
        cout << *i << " ";
    }
    cout << endl;
    cout << "Reverse Print: " << endl;
    for(auto ir = a.rbegin(); ir != a.rend(); ir++){
        cout << *ir << " ";
    }
    cout << endl;
    return 0;
}
