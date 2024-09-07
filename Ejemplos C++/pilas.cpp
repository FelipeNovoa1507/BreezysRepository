/*Una pila es una estructura de datos de entradas ordenadas tales que solo pueden
introducir y eliminar por un extremo, llamado cima.
las operaciones usuales en la pila son insertar y quitar.
la operacion insertar (push) añade un elemento en la cima de la pila y la 
operacion quitar (pop) elimina o saca un elemento de la pila.
entrada = 1,5,9
salida = 9,5,1
*/

// lo basico para armar una pila es: 

#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct Nodo{
    int dato;
    Nodo *siguiente;
};

void agregarDatoPila(Nodo *&, int); //puede ser una variable de cualquier tipo (CHAR,INT,FLOAT,ETC.)
void sacarDatoPila(Nodo*&,int&); //puede ser una variable de cualquier tipo (CHAR,INT,FLOAT,ETC.)

int main(){
    Nodo *pila=NULL;
    int dato; //el dato que se vaya a ingreasr en la pila puede ser de cualquier tipo
    int rpt;
    char rp;
    //Para agregar elementos a una pila    
    cout<<"Digite un numero";
    cin>>dato;
    agregarDatoPila(pila,dato);

    //Para agregar mas de un dato a la pila
    cout<<"Cuantos datos desea ingresar a la pila: ";
    cin>>rpt;
    for (int i=0;i<rpt;i++){
        cout<<"Digite un numero";
        cin>>dato;
        agregarDatoPila(pila,dato);
    }

    //Para agregar una cantidad determinada de datos a la pila
    do{
        cout<<"Digite un numero: ";
        cin>>dato;
        agregarDatoPila(pila,dato);

        cout<<"Desea agregar otro elemento a PILAS(s/n): ";
        cin>>rp;
    }while( (rpt=='S')||(rpt=='s'));

    //Para eliminar los alementos de la pila
    while(pila!=NULL){ //mientras no sea el final de la pila
        sacarDatoPila(pila,dato);
        if(pila!=NULL){
            cout<<dato<<" , ";
        }
        else{
            cout<<dato<<".";
        }
    } 
    getch();
    return 0;
}

void agregarDatoPila(Nodo *&pila, int n){ //
    Nodo *nuevo_nodo=new Nodo();
    nuevo_nodo->dato=n;
    nuevo_nodo->siguiente=pila;
    pila=nuevo_nodo;

    cout<<"\tElemento "<<n<<" ha sido agregado a PILA correctamente";

}

void sacarDatoPila(Nodo*&pila,int&n){
    Nodo*aux=pila;
    n=aux->dato;
    pila=aux->siguiente;
    delete aux;
}