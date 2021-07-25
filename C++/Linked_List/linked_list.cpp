#include<iostream>
using namespace std;

class node {
    public:
        int data;
        node *next;

        node (int val){
            data = val;
            next = NULL;
        }
};

void insertAtTail(node* &head, int val){
    node *n = new node(val);
    if (head == NULL){
        head = n;
        return;
    }
    node *temp = head;
    while(temp->next != NULL){
        temp = temp->next;
    }
    temp->next = n;
}

void insertAtHead(node* &head, int val){
    node *n = new node(val);
    if (head == NULL){
        head = n;
        return;
    }
    node* temp = head;
    head = n;
    head->next = temp;
}

bool search(node* head, int val){
    while(head->next != NULL){
        if(head->data == val){
            return true;
        }
        head = head->next;
    }
    return false;
}

void deleteHead(node* &head){
    node* temp = head;
    head = head->next;
    delete temp;
}

void deleteNode(node* &head, int key){
    if (head == NULL){
        return;
    }
    if (head->next == NULL){
        deleteHead(head);
        return;
    }
    node *currentNode = head;
    while(currentNode->next->data != key){
        currentNode = currentNode->next;
    }
    currentNode->next = currentNode->next->next;
    delete currentNode;
    return;
}

void reversePrinting(node* &head){
    if (head == NULL)
    {
        return;
    }
    reversePrinting(head->next);
    cout << head->data << " --> ";
    return;
}

node* reverseIterative(node* &head){
    node *prevNode = NULL;
    node *currentNode = head;
    node *nextNode;
    while(currentNode != NULL){
        nextNode = currentNode->next;
        currentNode->next = prevNode;
        prevNode = currentNode;
        currentNode = nextNode;
    }
    return prevNode;
}

node* reverseRecursive(node* &head){
    if (head == NULL || head->next == NULL){
        return head;
    }
    node* newHead = reverseRecursive(head->next);
    head->next->next = head;
    head->next = NULL;
    return newHead;
}

node* reverseK(node* &head, int k){
    node* prevNode = NULL;
    node* currNode = head;
    node* nextNode;
    int count = 0;
    while(currNode != NULL && count < k){
        nextNode = currNode->next;
        currNode->next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
        count++;
    }
    if (nextNode != NULL){
        head->next = reverseK(nextNode, k);
    }
    return prevNode;
}

void makeCycle(node* &head, int pos){
    node* temp = head;
    node *startNode;
    int count = 1;
    while(temp->next != NULL){
        if (count == pos){
            startNode = temp;
        }
        temp = temp->next;
        count++;
    }
    temp->next = startNode;
}

bool detectCycle(node* &head){
    node* slow = head;
    node* fast = head;
    while(fast != NULL && fast->next != NULL){
        slow = slow->next;
        fast = fast->next->next;
        if (fast == slow){
            return true;
        }
    }
    return false;
}

void removeCycle(node* &head){
    node* slow = head;
    node* fast = head;
    do {
        slow = slow->next;
        fast = fast->next->next;
    } while (slow != fast);
    fast = head;
    while(slow->next != fast->next){
        slow = slow->next;
        fast = fast->next;
    }
    slow->next = NULL;
}

int length(node* &head){
    int l = 0;
    node* temp = head;
    while(temp != NULL){
        l++;
        temp = temp->next;
    }
    return l;
}

// node* kappend(node* &head, int k){
//     // Append Last K Nodes of a Linked List
//     node* temp = head;
//     int count = 1;
//     int size = (length(head) - k);
//     // cout << size << endl;
//     while (temp != NULL && count != size)
//     {
//         temp = temp->next;
//         count++;
//     }
//     node *newTail = temp;
    
//     node *newHead = temp->next;
//     while(temp->next != NULL){
//         temp = temp->next;
//     }
//     temp->next = head;
//     newTail->next = NULL;
//     return newHead;
// }

node* kappend(node* &head, int k){
    // Append Last K Nodes of a Linked List
    node* temp = head;
    node *newHead;
    node *newTail;
    node* tail = head;
    int count = 1;
    int l = length(temp);
    k = k % l;
    while (tail->next != NULL)
    {
        if (count == (l - k)){
            newTail = tail;
        }
        if (count == (l - k + 1)){
            newHead = tail;
        }
        count++;
        tail = tail->next;
    }
    tail->next = head;
    newTail->next = NULL;
    // delete temp;
    return newHead;
}

// int intersection(node* &head1, node* &head2){
//     node* temp1 = head1;
//     node* temp2 = head2;
    
//     int l1 = length(temp1);
//     int l2 = length(temp2);

//     if (l1 > l2){
//         int count = 0;
//         while(count <= (l1 - l2)){
//             temp1 = temp1->next;
//             count++;
//         }
//         temp2 = temp2->next;
//     }
//     else{
//         int count = 0;
//         while(count <= (l2 - l1)){
//             temp2 = temp2->next;
//             count++;
//         }
//         temp1 = temp1->next;
//     }
//     // cout << temp1->data << " --> " << endl;
//     // cout << temp2->data << " --> " << endl;
//     while(temp1 != NULL && temp2 != NULL){
//         // cout << temp1->data << " --> " << temp2->data << endl;
//         if (temp1->next != NULL && temp2->next != NULL){
//             if(temp1->next->data == temp2->next->data){
//                 return temp1->next->data;
//         }
//         }
//         temp1 = temp1->next;
//         temp2 = temp2->next;
//     }
//     return -1;
// }

void intersect(node *&head1, node *&head2, int pos){
    node* temp1 = head1;
    pos--;
    while(pos--){
        temp1 = temp1->next;
    }
    node* temp2 = head2;
    while(temp2->next != NULL){
        temp2 = temp2->next;
    }
    temp2->next = temp1;
}

int intersection(node *&head1, node *&head2){
    int l1 = length(head1);
    int l2 = length(head2);
    int d = 0;
    node *ptr1;
    node *ptr2;
    if (l1 > l2){
        d = l1 - l2;
        ptr1 = head1;
        ptr2 = head2;
    }
    else{
        d = l2 - l1;
        ptr1 = head2;
        ptr2 = head1;
    }
    while (d){
        ptr1 = ptr1->next;
        if (ptr1 == NULL){
            return -1;
        }
        d--;
    }
    while(ptr1 != NULL && ptr2 != NULL){
        // cout << ptr1->data << " --> " << ptr2->data << endl;
        if (ptr1 == ptr2){
            return ptr1->data;
        }
        ptr1 = ptr1->next;
        ptr2 = ptr2->next;
    }
    return -1;
}

void display(node* head){
    node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " --> ";
        temp = temp->next;
    }
    cout << "NULL" << endl;
}

node* merge(node* &head1, node* &head2){
    node* temp1 = head1;
    node* temp2 = head2;
    node *newHead = new node (-1);
    node *merge = newHead;

    while (temp1 != NULL && temp2 != NULL)
    {
        if (temp1->data > temp2->data){
            merge->next = temp2;
            temp2 = temp2->next;
        }
        else{
            merge->next = temp1;
            temp1 = temp1->next;
        }
        merge = merge->next;
    }
    
    while (temp1 != NULL)
    {
        merge->next = temp1;
        temp1 = temp1->next;
        merge = merge->next;
    }
    while(temp2 != NULL){
        merge->next = temp2;
        temp2 = temp2->next;
        merge = merge->next;
    }
    return newHead->next;
}



int main() {
    node *head = NULL;
    insertAtTail(head, 1);
    insertAtTail(head, 2);
    insertAtTail(head, 3);
    insertAtTail(head, 4);
    insertAtTail(head, 5);
    insertAtTail(head, 6);
    // insertAtHead(head, 0);
    // display(head);
    // reversePrinting(head);
    cout << "NULL" << endl;
    cout << search(head, 4) << endl;
    cout << search(head, 6) << endl;
    // deleteHead(head);
    // dispaly(head);
    // deleteNode(head, 5);
    // dispaly(head);
    // deleteNode(head, 6);
    // display(head);
    // reversePrinting(head);
    // cout << "NULL" << endl;
    // dispaly(reverseIterative(head));
    // dispaly(reverseRecursive(head));
    // dispaly(reverseK(head,2));
    // display(kappend(head, 3));
    node *head1, *head2;
    // int arr[] = {1, 2, 3, 4, 5, 6};
    // int arr2[] = {9, 10, 15, 6};
    
    // for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++){
    //     insertAtTail(head1, arr[i]);
    // }
    // for (int i = 0; i < sizeof(arr2)/sizeof(arr2[0]); i++){
    //     insertAtTail(head2, arr2[i]);
    // }
    insertAtHead(head1, 1);
    insertAtTail(head2, 2);
    insertAtTail(head1, 3);
    insertAtTail(head2, 4);
    insertAtTail(head1, 5);
    insertAtTail(head2, 6);
    insertAtTail(head1, 9);
    insertAtTail(head2, 10);
    // intersect(head1, head2, 3);
    // cout << intersection(head1, head2) << endl;
    display(head1);
    display(head2);
    display(merge(head1, head2));
    return 0;
}