#include<iostream>
#include<string>

using namespace std;

int main(){
  // Predefined
  string str(5, 'a');
  cout << str << endl;

  // 
  string str1 = "Digital Community";
  cout << str1 << endl;
  

  // Taking Line Input From User
  string str2;
  getline(cin, str2);
  cout << str2 << endl;

  // Append
  string s1 = "fam";
  string s2 = "ily";
  s1.append(s2);
  cout << s1 << endl;

  // Concatination
  cout << s1 + s2 << endl;
  s1 = s1 + s2;
  cout << s1 << endl;

  // Clear
  string abc = "ssafuhisgdfsjvbuariebcsaoi";
  abc.clear();
  cout << abc;

  // Comparing Strings
  string s3 = "abc";
  string s4 = "xyz";
  cout << s2.compare(s1) << endl;
  if (s2.compare(s2) == 0){
    cout << "Strings are Equal";
  }

  if (!s2.compare(s2)){
    cout << "Strings are Not Equal";
  }
  
  // Checking Empty
  string s5 = "abc";
  cout << s5 << endl;
  s5.clear();

  if (s5.empty()){
    cout << "String Is Empty";
  }
  
  if (!s5.empty()){
    cout << "String Is Not Empty";
  }

  // Erase 
  string s6 = "nincompoop";
  s6.erase(3,3);
  cout << s6 << endl;

  // Find 
  // Returns First Index Where it finds the Strings.

  cout << s6.find("com") << endl;
  cout << s6.find("poo") << endl;

  // Insert Function
  s6.insert(2, "lol");
  cout << s6 << endl;

 // Length of String
  cout << s1.size() << endl;
  cout << s6.length() << endl;
  
 // SubString of a String
  string s = s6.substr(6, 4);
  cout << s << endl;

  // String To Integer
  string s7 = "994";
  int x = stoi(s7);
  cout << x + 2 << endl;

  // Integer to String 
  int y = 786;
  cout << to_string(y) + "1" << endl;

  
  return 0;

}
