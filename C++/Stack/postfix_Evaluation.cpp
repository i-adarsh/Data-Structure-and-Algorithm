#include<iostream>
#include<stack>
#include<math.h>

using namespace std;

int postfixEvaluation (string s){
    stack<int> st;
    for (int i = 0; i < s.length(); i++){
        if(s[i] >= '0' && s[i] <= '9'){
            st.push(s[i] - '0');
        }
        else{
            int operand2 = st.top();
            st.pop();
            int operand1 = st.top();
            st.pop();

            switch (s[i])
            {
            case '+':
                cout << "+" << operand1 + operand2 << endl;
                st.push(operand1 + operand2);
                break;
            case '-':
                cout << "-" << operand1 - operand2 << endl;
                st.push(operand1 - operand2);
                break;
            case '*':
                cout << "*" << operand1 * operand2 << endl;
                st.push(operand1 * operand2);
                break;
            case '^':
                cout << "^" << pow(operand1, operand2) << endl;
                st.push(pow(operand1, operand2));
                break;
            case '/':
                cout << "/" << operand1 + operand2 << endl;
                st.push(operand1 / operand2);
                break;
            default:
                break;
            }
        }
    }
    return st.top();
}

int main(){
    string s = "46+2/5*7+";
    cout << postfixEvaluation(s) << endl;
}
