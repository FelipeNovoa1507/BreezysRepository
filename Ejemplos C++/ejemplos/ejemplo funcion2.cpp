#include<iostream>
#include<conio.h>
#include<math.h>
using namespace std;
void al_cuadrado();

int main(){

    al_cuadrado();

    getch();
    return 0;
}

void al_cuadrado(){
    float num1=0,tot=0;
    cout<<"Digite el numero a elevar: ";
    cin>>num1;
    tot=pow(num1,2);
    cout<<tot<<endl;
}