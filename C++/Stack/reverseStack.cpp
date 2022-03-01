#include<iostream>
#include<stack>
using namespace std;

void insertAtBottom(stack<int> &st, int val){
    if (st.empty()){
        st.push(val);
        return;
    }
    int topE = st.top();
    st.pop();
    insertAtBottom(st, val);
    st.push(topE);
}

void reverseStack(stack<int> &st){
    if (st.empty()){
        return;
    }
    int val = st.top();
    st.pop();
    reverseStack(st);
    insertAtBottom(st, val);
}

int main (){
    stack<int> st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    // do{
    //     cout << st.top() << " ";
    //     st.pop();
    // } while (st.empty() == false);
    // cout << endl;
    reverseStack(st);
    do{
        cout << st.top() << " ";
        st.pop();
    } while (!st.empty());
    cout << endl;
}