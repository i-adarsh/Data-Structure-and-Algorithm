#include<iostream>
using namespace std;

class node{
    public:
        int data;
        node *next;

        node(int val){
            data = val;
            next = NULL;
        }
};

void insertAtHead(node* &head, int val){
    node* n = new node(val);
    if (head == NULL){
        head = n;
        return;
    }
    n->next = head;
    head = n;
}

void insertAtTail(node* &head, int val){
    if (head == NULL){
        insertAtHead(head, val);
        return;
    }
    node* temp = head;
    node* n = new node(val);
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = n;
}

void display(node* &head){
    node* temp = head;
    while(temp != NULL){
        cout << temp->data << " --> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

node* oddEven(node* &head){
    // Put Even Position Nodes after Odd Position Nodes
}

int main(){
    node* head = NULL;
    insertAtHead(head, 1);
    insertAtHead(head, 2);
    insertAtHead(head, 3);
    insertAtHead(head, 4);
    insertAtHead(head, 5);
    insertAtHead(head, 6);
}