#include<iostream>
#include<stack>
using namespace std;

bool balanced(string s){
    stack<char> st;
    int n = s.size();
    bool ans = true;
    if (s.size() == 1){
        return false;
    }

    else{
        for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == '(' || s[i] == '{' || s[i] == '['){
            st.push(s[i]);
            continue;
        }
        else{
            if (st.empty()) return false;
            else if (!st.empty() && s[i] == ')'){
            if (st.top() == '('){
                st.pop();
            }
            else{
                ans = false;
                break;
            }
        }
        else if (!st.empty() && s[i] == '}'){
            if (st.top() == '{'){
                st.pop();
            }
            else{
                ans = false;
                break;
            }
        }
        else if (!st.empty() && s[i] == ']'){
            if (st.top() == '['){
                st.pop();
            }
            else{
                ans = false;
                break;
            }
        }
        }
    }
    return ans;
    }
}

bool ispar(string s){
        stack<char> st;
    int n = s.size();
    bool ans = false;
    int flag = 0;
    if (s.size() == 1){
        return false;
    }
    else{
        for (int i = 0; i < s.length(); i++)
    {
        if (s[i] == '(' || s[i] == '{' || s[i] == '['){
            st.push(s[i]);
            flag++;
            continue;
        }
        else{
            if (st.empty()) return false;
            else if (!st.empty() && s[i] == ')'){
            if (st.top() == '('){
                st.pop();
                flag--;
            }
            else{
                ans = false;
                break;
            }
        }
        else if (!st.empty() && s[i] == '}'){
            if (st.top() == '{'){
                st.pop();
                flag--;
            }
            else{
                ans = false;
                break;
            }
        }
        else if (!st.empty() && s[i] == ']'){
            if (st.top() == '['){
                st.pop();
                flag--;
            }
            else{
                ans = false;
                break;
            }
        }
        }
    }
    if (flag == 0){
        ans = true;
    }
    return ans;
    }
    }

int main (){
    string s = "{([])}";
    if (balanced(s)){
        cout << "Valid" << endl;
    }
    else{
        cout << "InValid" << endl;
    }
    return 0;
}