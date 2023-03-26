#include<iostream>
using namespace std;

class TestClass{
int x;
public:
void* operatornew(size_t size);
void operatordelete(void*);
TestClass(int i) {
x = i;
cout << "Constructor called";
}
~TestClass() { cout << "Destructor called"; }
};
void* TestClass::operatornew(size_t size){
    void *storage = malloc(size);
    cout << "new called";
    return storage;
}

void TestClass::operatordelete(void *p){
cout<<"delete called";
free(p);
}

int main(){
TestClass obi(5);
return 0;
}
