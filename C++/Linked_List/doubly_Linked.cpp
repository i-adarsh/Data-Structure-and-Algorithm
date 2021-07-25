#include<iostream>
using namespace std;

class node{
    public:
        int data;
        node *next;
        node *prev;
        node(int val){
            data = val;
            next = NULL;
            prev = NULL;
        }
};

void insertAtHead(node* &head, int val){
    node *n = new node(val);
    if (head == NULL){
        head = n;
        return;
    }
    n->next = head;
    if (head != NULL){
        head->prev = n;
    }
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
    n->prev = temp;
}

bool search(node* &head, int val){
    node* temp = head;
    while(temp != NULL){
        if(temp->data == val){
            return true;
        }
        temp = temp->next;
    }
    return false;
}

node* deleteHead(node* &head){
    node* temp = head;
    head = head->next;
    head->prev = NULL;
    delete temp;
    return head;
}

void deleteNode(node* &head, int val){
    
    if (head == NULL){
        return;
    }
    if (head->next == NULL){
        deleteHead(head);
        return;
    }
    node* temp = head;
    while(temp->next->data != val){
        temp = temp->next;
    }
    cout << temp->data << endl;
    if (temp->next->next == NULL){
        temp->next = NULL;
        return;
    }
    else{
        temp->next->next->prev = temp;
        temp->next = temp->next->next;
    }
    delete temp;
    return;
}

node* reverseIterative(node* &head){
    node* prevNode = NULL;
    node* currNode = head;
    node * nextNode;
    while(currNode->next != NULL){
        nextNode = currNode->next;
        currNode->next = prevNode;
        
    }
}


void display(node* head){
    node *temp = head;
    while(temp != NULL){
        cout << temp->data << " --> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

int main (){
    node *head = NULL;
    insertAtTail(head, 1);
    insertAtTail(head, 2);
    insertAtTail(head, 3);
    insertAtTail(head, 4);
    insertAtTail(head, 5);
    insertAtTail(head, 6);
    insertAtHead(head, 7);
    cout << search(head, 6) << endl; 
    cout << search(head, 8) << endl;
    display(head);
    display(deleteHead(head));
    // deleteNode(head, 6);
    // deleteNode(head, 4);
    deleteNode(head, 3);
    display(head);
    return 0;
}