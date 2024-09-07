/*Transmision de direcciones
ejemplo: intercambiar el valor de 2 variables. */

#include<iostream>
#include<conio.h>
using namespace std;

void intercambio(float *,float *); //Prototipo

int main(){
    float num1=20.8,num2=6.78;

    cout<<"Primer numero: "<<num1<<endl;
    cout<<"Segundo numero: "<<num2<<endl;

    intercambio(&num1,&num2);

    cout<<"\n\nDespues del intercambio; \n\n";
    cout<<"El nuevo valor del numero uno es: "<<num1<<endl;
    cout<<"El nuevo valor del numero dos es: "<<num2<<endl;
    getch();
    return 0;
}

void intercambio(float *dirNm1, float*dirNm2){
    float aux;

    aux=*dirNm1;
    *dirNm1=*dirNm2;
    *dirNm2=aux;
}