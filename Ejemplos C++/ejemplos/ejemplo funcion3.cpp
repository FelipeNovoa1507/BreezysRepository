#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;

void funpot();

int main(){
    int x=0;
    while(x==0){
        funpot();
    }


    getch();
    return 0;
}

void funpot(){
    int num1=0,num2=0;
    long tot=0;
    cout<<"Digite el numero a elevar: ";
    cin>>num1;
    cout<<"Digite el numero que lo elevara: ";
    cin>>num2;
    tot=pow(num1,num2);
    cout<<tot<<endl;


}