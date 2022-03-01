#include<iostream>
using namespace std;

#define n 20

class queue{
    int *arr;
    int front;
    int back;

    public:
        queue(){
            arr = new int[n];
            front = back = -1;
        }

        void push(int val){
            if (back = n-1){
                cout << "No Space Left, Queue Overflow" << endl;
                return;
            }
            back++;
            arr[back] = val;
            if (front == -1)
            {
                front++;
            }
        }

        void pop(){
            if (front == -1 || front > back){
                cout << "No elements present in queue" << endl;
                return;
            }
            front++;
            return;
        }

        int peek(){
            if (front == -1 || front > back){
                cout << "No elements present in queue" << endl;
                return -1;
            }
            return arr[front];
        }
};
