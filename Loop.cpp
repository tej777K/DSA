#include<iostream>
using namespace std;
int main(){
    char ch;
    cout<<"Enter the characters "<<endl;
    cin>>ch;
    if (ch>=65&&ch<=90)
    {
        cout<<"The entered character is upper case Alphabets "<<endl;

    }
    else if (ch>=97&&ch<=122)
    {
        cout<<"The entered chracter is lower case Alphabets"<<endl;
    }
    else
    {
        
        cout<<"you have entered other than the alphabets"<<endl;

    }
    return 0;
    
    
}