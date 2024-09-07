/*Ejercicio 1: Hacer un programa utilizando colas quer contenga el siguiente menu: 
    1: insertar un caracter a una cola
    2: mostrar todos los elementos de la cola
    3: Salir*/
#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct Nodo{
    char dato;
    Nodo *siguiente;
};

void agregarDatoCola(Nodo*&,Nodo*&,char);
void eliminarDatosColas(Nodo*&,Nodo*&,char&);
bool colaVacia(Nodo*);
int main(){
    Nodo*frente=NULL;
    Nodo*fin=NULL;
    char dato;
    int opcion;

    do{
        fflush(stdin);
        cout<<"Menu Principal"<<endl;
        cout<<"1.- Insertar un caracter a una cola."<<endl;
        cout<<"2.- Mostrar todos los elementos de la cola"<<endl;
        cout<<"3.- Salir"<<endl;
        cout<<"Digite una opcion: "<<endl;
        cin>>opcion;
        switch(opcion){
            case 1: cout<<"Ingrese un caracter para agregar a la cola: ";
                    cin>>dato;
                    agregarDatoCola(frente,fin,dato);
                    break;
            case 2: cout<<"\nMostrando los elementos de la cola: "<<endl;
                    while(frente!=NULL){
                        eliminarDatosColas(frente,fin,dato);
                        if(frente!=NULL){
                            cout<<dato<<", ";
                        }
                        else{
                            cout<<dato<<"."<<endl;
                        }
                    }
                    system("pause");
                    break;
            case 3: break;
        }
        system("cls");  
    }while(opcion!=3);



    getch();
    return 0;
}

void agregarDatoCola(Nodo*&frente,Nodo*&fin,char n){
    Nodo *nuevo_nodo=new Nodo();
    nuevo_nodo->dato=n;
    nuevo_nodo->siguiente=NULL;

    if(colaVacia(frente)){
        frente=nuevo_nodo;
    }
    else{
        fin->siguiente=nuevo_nodo;
    }
    fin=nuevo_nodo;

    cout<<"ELemento "<<n<<" agregado con exito.";
}
bool colaVacia(Nodo*frente){
    return(frente==NULL)? true:false;
}

void eliminarDatosColas(Nodo*&frente,Nodo*&fin,char&n){
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
