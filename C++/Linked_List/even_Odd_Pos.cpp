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

void evenAfterOdd(node* &head){
    // Put Even Position Nodes after Odd Position Nodes
    node* temp = head;
    node* odd = head;
    node* evenStart = head->next;
    node* even = head->next;
    while(odd->next != NULL && even->next != NULL){
        odd->next = even->next;
        odd = odd->next;

        even->next = odd->next;
        even = even->next;
    }
    odd->next = evenStart;
    if (odd->next != NULL){
        even->next = NULL;
    }
}

int main(){
    node* head = NULL;
    insertAtTail(head, 1);
    insertAtTail(head, 2);
    insertAtTail(head, 3);
    insertAtTail(head, 4);
    insertAtTail(head, 5);
    insertAtTail(head, 6);
    display(head);
    evenAfterOdd(head);
    display(head);
}