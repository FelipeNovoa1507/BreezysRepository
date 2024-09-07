/*insertar datos, mostrar datos, eliminar datos y buscar datos de una lista*/

#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct Nodo{
    int dato;
    Nodo *siguiente;
};

//Prototipo de funciones
void menu();
void insertarLista(Nodo*&,int); //Funcion para insertar un elemento en la lista
void mostrarLista(Nodo*); //Funcion para mostrar los elementos en la lista
void buscarLista(Nodo *,int); //Funcion para buscar un elemento en la lista
void eliminarNodo(Nodo*&,int); //Funcion para eliminar un elemento en la lista
void eliminarLista(Nodo*&,int&); //Funcion para eliminar la lista completa

Nodo *lista=NULL;

int main(){
    
    menu();

    getch();
    return 0;
}

void menu(){
    int opc=0,dato=0;

    do{
        cout<<"1.- Insertar un dato a la lista."<<endl;
        cout<<"2.- Mostrar datos de la lista. "<<endl;
        cout<<"3.- Buscar datos de la lista."<<endl;
        cout<<"4.- Eliminar datos de la lista."<<endl;
        cout<<"5.- Eliminar lista. "<<endl;
        cout<<"6.- Salir."<<endl;
        cout<<"Digite opcion: "<<endl;
        cin>>opc;
        switch(opc){
            case 1: cout<<"Digite un numero: ";
                    cin>>dato;
                    insertarLista(lista,dato);
                    cout<<"\n";
                    system("pause");
                    break;
            case 2: cout<<"Mostrando los elementos de la lista: ";
                    mostrarLista(lista);
                    cout<<"\n";
                    system("pause");
                    break;
            case 3: cout<<"Digite el dato que desea buscar: ";
                    cin>>dato;
                    buscarLista(lista,dato);
                    cout<<"\n";
                    system("pause");
                    break;
            case 4: cout<<"Digite el dato que desea eliminar: ";
                    cin>>dato;
                    eliminarNodo(lista,dato);
                    cout<<"\n";
                    system("pause");
                    break;
            case 5: while(lista!=NULL){ //mientras no sea el final de la lista
                        eliminarLista(lista,dato);
                        cout<<dato<<" -> "<<endl;
                        cout<<"La lista se ha eliminado correctamente. "<<endl;
                    }
                    cout<<"\n";
                    system("pause");
                    break;

            case 6: break;
        }   
        system("cls");
    }while(opc!=6);
}

void insertarLista(Nodo *&lista,int n){ //Funcion para insertar datos en una lista
    Nodo *nuevo_nodo=new Nodo();
    nuevo_nodo->dato=n;

    Nodo *aux1=lista;
    Nodo *aux2;

    while((aux1!=NULL)&&(aux1->dato<n)){
        aux2=aux1;
        aux1=aux1->siguiente;
    }
    if(lista==aux1){
        lista=nuevo_nodo;
    }
    else{
        aux2->siguiente=nuevo_nodo;
    }
    nuevo_nodo->siguiente=aux1;

    cout<<"\tElemento "<<n<<" insertando a lista correctamente\n";
}

void mostrarLista(Nodo*lista){ //Funcion para mostrar datos de una lista
    Nodo *actual=new Nodo();
    actual=lista;

    while(actual!=NULL){
        cout<<actual->dato<<" -> ";
        actual=actual->siguiente; 
    }
}

void buscarLista(Nodo*lista,int n){ //Funcion para buscar un elemento de la lista.
    bool band=false;
    
    Nodo*actual=new Nodo();
    actual=lista;

    while((actual!=NULL)&&(actual->dato<=n)){
        if(actual->dato==n){
            band=true;
        }
        actual=actual->siguiente;
    }
    if(band==true){
        cout<<"Elemento "<<n<<" SI ha sido encontrado en lista\n";
    }
    else{
        cout<<"Elemento "<<n<<" NO ha sido encontrado en lista\n";
    }
}   

void eliminarNodo(Nodo*&lista,int n){ //Funcion para eliminar un elemento de la lista
    //Preguntar si la lista esta vacia
    if(lista!=NULL){
        Nodo *aux_borrar;
        Nodo *anterior=NULL;

        aux_borrar=lista;

        //Recorrer la lista
        while((aux_borrar!=NULL)&&(aux_borrar->dato!=n)){
            anterior=aux_borrar;
            aux_borrar=aux_borrar->siguiente;
        }

        //El elemento no ha sido encontrado
        if(aux_borrar==NULL){
            cout<<"El elemento no existe";
        }
        //El primer elemento es el que vamos a eliminar
        else if(anterior==NULL){
            lista=lista->siguiente;
            delete aux_borrar;
        }
        //El elemento esta en la lista pero no es el primero
        else{
            anterior->siguiente=aux_borrar->siguiente;
            delete aux_borrar;
        }
        cout<<"\n El elemento "<<n<<" ha sido eliminado correctamente\n";
    }
}

void eliminarLista(Nodo*&lista,int&n){
    Nodo*aux=lista;
    n=aux->dato;
    lista=aux->siguiente;
    delete aux;
}