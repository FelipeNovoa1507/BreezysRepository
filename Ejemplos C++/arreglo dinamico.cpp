#include<iostream>
#include<conio.h>
#include<stdlib.h> //Funciona new y delete
using namespace std;

//Prototipo de funcion
void pedirNotas();
void mostrarNotas();

int numCalif,*calif;

int main(){
    pedirNotas();
    mostrarNotas();
    delete[] calif; //liberar espacio

    getch();
    return 0;
}

void pedirNotas(){
    cout<<"Digite el numero de calificaciones: ";
    cin>>numCalif;

    calif=new int[numCalif]; //Crear el arreglo

    for(int i=0;i<numCalif;i+=1){
        cout<<"Ingrese una nota";
        cin>>calif[i];
    }
}

void mostrarNotas(){
    cout<<"\n\nMostrando notas del usuario:\n";
    for(int i=0;i<numCalif;i+=1){
        cout<<calif[i]<<endl;
    }
}