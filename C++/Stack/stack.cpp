#include<iostream>
using namespace std;

#define n 100

class stack{
    int* arr;
    int top;
    public:
        stack(){
            arr = new int [n];
            top = -1;
        }
        void push(int x){
            if (top == n-1){
                cout << "Stack Overflow" << endl;
                return;
            }
            top++;
            arr[top] = x;
        }
        void pop(){
            if (top == -1){
                cout << "Stack is Empty" << endl;
                return;
            }
            top--;
        }
        int Top(){
            if (top == -1){
                cout << "Stack is Empty" << endl;
                return -1;
            }
            return arr[top];
        }
        bool empty(){
            return top == -1;
        }
        int get(int pos){
            if (pos <= -1){
                cout << "Wrong Position" << endl;
                return -1;
            }
            return arr[pos];
        }
        void display(){
            int i = 0;
            while (i <= top){
                cout << arr[i] << " ";
                i++;
            }
            cout << endl;
        }
};

int main (){
    stack st;
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    cout << st.Top() << endl;
    st.pop();
    cout << st.Top() << endl;
    st.pop();
    st.pop();
    cout << st.empty() << endl;
    st.pop();
    st.pop();
    cout << st.empty() << endl;
    // st.display();
    return 0;
}