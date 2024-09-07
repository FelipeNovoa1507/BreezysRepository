/*Colas: una cola es una estuctura de datos, caracterizada por ser una secuencia de elementos 
en la que la operacion de insercion se realiza por un extremo y la extraccion por el otro
Las operaciones usuales en las colas son insertar y quitar. La operacion insertar añade un 
elemento por el extremo final de la cola
y la operacion quitar elimina o extrae un elemento por el extremo opuesto*/
#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

//Insertar y eliminar elementos de una cola

struct Nodo{
    int dato;
    Nodo *siguiente;
};

//Prototipos de funcion
void insertarCola(Nodo *&,Nodo *&,int);
void suprimirCola(Nodo *&,Nodo *&,int &);
bool cola_vacia(Nodo *);

int main(){
    Nodo *frente=NULL;
    Nodo *fin=NULL;

    int dato;

    for(int i=0;i<5;i++){
        cout<<"Digite un numero: ";
        cin>>dato;
        insertarCola(frente,fin,dato);
    }

    while(frente!=NULL){
        suprimirCola(frente,fin,dato);

        if(frente!=NULL){
            cout<<dato<<", ";
        }
        else{
            cout<<dato<<".";
        }
    }
    getch();
    return 0;
}

//Funcion para insertar elementos en una cola:
void insertarCola(Nodo *&frente,Nodo *&fin, int n){
    Nodo *nuevo_nodo=new Nodo();

    nuevo_nodo->dato=n;
    nuevo_nodo->siguiente=NULL;

    if(cola_vacia(frente)){
        frente=nuevo_nodo;
    }
    else{
        fin->siguiente=nuevo_nodo;
    }
    fin=nuevo_nodo;

    cout<<"\tElemento "<<n<<" insertado a cola correctamente.\n";
}

//Funcion para eliminar elementos de una cola:
void suprimirCola(Nodo*&frente,Nodo*&fin,int&n){
    n=frente->dato;
    Nodo*aux=frente;

    if(frente==fin){
        frente=NULL;
        fin=NULL;
    }
    else{
        frente=frente->siguiente;
    }
    delete aux;
}


//Funcion para determinar si la cola esta vacia o no.
bool cola_vacia(Nodo *frente){
    return(frente==NULL)? true:false;
    }