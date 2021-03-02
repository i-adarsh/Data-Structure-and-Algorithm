#include<iostream>
#include<string>
#include<algorithm>

using namespace std;
int main(){

    string str = "sahgyuewbghsfsbcdfuyw";

    char freq[26];

    for (int i = 0; i < 26; i++)
        freq[i] = 0;
    for (int i = 0; i <str.size(); i++)
        freq[str[i] - 'a']++;

    char ans = 'a';
    int maxF = 0;

    
    return 0;
}