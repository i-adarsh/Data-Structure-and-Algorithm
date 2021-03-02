#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

int main(){

    string str = "dvjuaweyftwbcuewc";

    cout << 'a' - 'A' << endl;

    // Convert Into Upper Case

    for (int i = 0; i < str.length(); i++){
        if (str[i] >= 'a' && str[i] <='z')
            str[i] -= 32;
    }

    cout << str << endl;

    // Convert Into Lower Case
    for (int i = 0; i < str.length(); i++){
        if (str[i] >= 'A' && str[i] <='Z')
            str[i] += 32;
    }

    cout << str << endl;

    str = "dvjuaweyftwbcuewc";

    // Transform to Upper Case
    transform(str.begin(), str.end(), str.begin(), ::toupper);


    // Transform to Lower Case
    transform(str.begin(), str.end(), str.begin(), ::tolower);

    

    return 0;
}
