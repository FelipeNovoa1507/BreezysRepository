/*Escribe un programa que defina un vector de numeros y calcule la suma de
sus elementos.*/
#include<iostream>
#include<conio.h>
using namespace std;
int main(){
    int numeros[100],n,mayor=0;
    cout<<"Digite el numero de elementos del arreglo: ";
    cin>>n;
    for(int i=0;i<n;i+=1){
        cout<<i+1<<". Digite un numero: ";
        cin>>numeros[i];
        if(numeros[i]>mayor){
            mayor=numeros[i];
        }
    }
    cout<<"\nEl mayor elemento del vector es: "<<mayor<<endl;
    getch();
    return 0;
}