// Insertar numeros enteros a una pila hatsa que el usuario decida, luego mostrar los datos.
#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct Nodo{
    char dato;
    Nodo *siguiente;
};

void agregarDatoPila(Nodo*&,char);
void mostrarElementoPila(Nodo*&,char&);

int main(){
    char letra,rp,aux;
    Nodo *pila=NULL;

    do{
        cout<<"Digite el caracter a ingresar: ";
        cin>>letra;
        agregarDatoPila(pila,letra);

        cout<<"Desea ingresar otro caracter? Digite (s/n) ";
        cin>>rp;
    }while((rp=='S')||(rp=='s'));

    cout<<"\n\nLos elementosd de la pila son: \n\n";
    while(pila!=NULL){ //mientras no sea el final de la pila
        mostrarElementoPila(pila,letra);
        if(pila!=NULL){
            cout<<letra<<" , ";
        }
        else{
            cout<<letra<<".";
        }
    } 
    getch();
    return 0;
}

void agregarDatoPila(Nodo*&pila, char n){
    Nodo *nuevo_nodo=new Nodo();
    nuevo_nodo->dato=n;
    nuevo_nodo->siguiente=pila;
    pila=nuevo_nodo;

    cout<<"\n\nElemento "<<n<<" ha sido agregado a PILA correctamente";

}

void mostrarElementoPila(Nodo*&pila,char&n){
    Nodo*aux=pila;
    n=aux->dato;
    pila=aux->siguiente;
    delete aux;

}