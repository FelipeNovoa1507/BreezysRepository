/*un arbol consta de un conjunto finito de elementos denominados nodos y un conjunto
finito de linieas dirigidas, denominadas ramas, que conectan los nodos 
los arboles binarios son arboles de orden 2. se conoce el nodo de la izquierda como hijo
izquierdo y el nodo de la derecha como hijo derecho.
un arbol binario es una estructura recursiva. un arbol binario se divide 
en tres subconjuntos disjuntos:
-nodo raiz
-subarbol izquierdo
-subarbol derecho

hay tres tipos de arbol
-arbol lleno (todos los espacios llenos)
-arbol completo (los ultimos nodos no estan completos)
-arbol degenerado (solo tiene un hijo)

arbol binario de busqueda: 
es aquel que dado un nodo, todos los datos del subarbol izquierdo son menores, mientras que 
todos los datos del subarbol derecho son mayores.
*/
#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

struct Nodo{
    int dato;
    Nodo *der;
    Nodo *izq;
    Nodo *padre;
};

//Prototipos
void menu();
void insertarNodo(Nodo *&,int,Nodo*); //Insertar datos al arbol
void mostrarArbol(Nodo*,int); //mostrar datos del arbol
bool buscarNodo(Nodo *,int); //buscar datos en el arbol
void preOrden(Nodo*); //recorrer arbol en preorden
void inOrden(Nodo*); //recorrer arbol en inorden
void postOrden(Nodo*); //recorrer el arbol en postOrden
void eliminar(Nodo*,int); //Eliminar un nodo del arbol
void eliminarNodo(Nodo*);
void reemplazar(Nodo*,Nodo*);
void destruirNodo(Nodo*);
Nodo *minimo(Nodo*);
Nodo *crearNodo(int,Nodo*); //crear arbol binario
Nodo *arbol=NULL;


int main(){
    menu();

    getch();
    return 0;
}

//Funcion de menu
void menu(){
    int dato,opcion,cont=0;

    do{
        system("cls");
        cout<<"\t.:MENU:."<<endl;
        cout<<"1.- Insertar un nuevo nodo"<<endl; //numeracion de ejemplo: 
        cout<<"2.- Mostrar datos del arbol"<<endl;
        cout<<"3.- Buscar un dato en el arbol"<<endl;
        cout<<"4.- Recorrer el arbol en PreOrden"<<endl;
        cout<<"5.- Recorrer el arbol en InOrden"<<endl;
        cout<<"6.- Recorrer el arbol en PostOrden"<<endl;
        cout<<"7.- Eliminar un nodo"<<endl;
        cout<<"8.- Salir"<<endl;
        cout<<"\nDigite opcion: ";
        cin>>opcion;
        system("cls");
        switch(opcion){
            case 1: cout<<"\nDigite un numero: ";
                    cin>>dato;
                    insertarNodo(arbol,dato,NULL); //insertamos un nuevo nodo
                    cout<<"\n";
                    break;
            case 2: cout<<"\nMostrando arbol completo\n";
                    mostrarArbol(arbol,cont);
                    cout<<"\n";
                    system("pause");
                    break;
            case 3: cout<<"\nDigite el elemento a buscar: ";
                    cin>>dato;
                    if(buscarNodo(arbol,dato)==true){
                        cout<<"\nElemento "<<dato<<" ha sido encontrado en el arbol.";
                    }
                    else{
                        cout<<"\nElemento "<<dato<<" no ha sido encontrado en el arbol.";
                    }
                    cout<<"\n";
                    system("pause");
                    break;
            case 4: cout<<"\nRecorrido en PreOrden: ";
                    preOrden(arbol);
                    cout<<"\n\n";
                    system("pause");
                    break;
            case 5: cout<<"\nRecorrido en InOrden: ";
                    inOrden(arbol);
                    cout<<"\n\n";
                    system("pause");
                    break;
            case 6: cout<<"\nRecorrido en PostOrden: ";
                    postOrden(arbol);
                    cout<<"\n\n";
                    system("pause");
                    break;
            case 7: cout<<"\nDigite el numero a eliminar: ";
                    cin>>dato;
                    eliminar(arbol,dato);
                    cout<<"\n\n";
                    system("pause");
                    break;
            case 8: cout<<"Gracias por usarme..."<<endl;
                    system("pause");
                    break;
        }
        system("cls");
    }while(opcion!=8);
}

//Funcion para crear un nuevo nodo
Nodo *crearNodo(int n,Nodo*padre){
    Nodo *nuevo_nodo=new Nodo();

    nuevo_nodo->dato=n;
    nuevo_nodo->der=NULL;
    nuevo_nodo->izq=NULL;
    nuevo_nodo->padre=padre;
    return nuevo_nodo;
}

//Funcion para insertar elementos en el arbol
void insertarNodo(Nodo *&arbol,int n,Nodo*padre){
    if(arbol==NULL){ //Si el arbol esta vacio
        Nodo *nuevo_nodo=crearNodo(n,padre);
        arbol=nuevo_nodo;
    }
    else{ //Si el arbol tiene un nodo o mas de un nodo
        int valorRaiz=arbol->dato; //obtenemos el valor de la raiz del arbol
        if(n<valorRaiz){ //si el elemento es menor a la raiz se insertara en la izquierda
            insertarNodo(arbol->izq,n,arbol);
        }
        else{ //si el elemento es mayor a la raiz se insertara en la derecha
            insertarNodo(arbol->der,n,arbol);
        }
    }
}

//Funcion para mostrar los datos del arbol
void mostrarArbol(Nodo*arbol,int cont){
    if(arbol==NULL){
        return;
    }
    else{
        mostrarArbol(arbol->der,cont+1); 
        for(int i=0;i<cont;i++){
            cout<<"   ";
        }
        cout<<arbol->dato<<endl;
        mostrarArbol(arbol->izq,cont+1);
    }
}

//Funcion para buscar un elemento en el arbol
bool buscarNodo(Nodo*arbol, int n){
    if(arbol==NULL){
        return false;
    }
    else if(arbol->dato==n){
        return true;
    }
    else if(n<arbol->dato){
        return buscarNodo(arbol->izq,n);
    }
    else{
        return buscarNodo(arbol->der,n);
    }

}

//Funcion para recorrido en profundidad preOrden
void preOrden(Nodo*arbol){

    if(arbol==NULL){
        return;
    }
    else{
        cout<<arbol->dato<<" - ";
        preOrden(arbol->izq);
        preOrden(arbol->der);
    }
}

//Funcion para recorrido en profundidad inOrden
void inOrden(Nodo*arbol){
    if(arbol==NULL){
        return;
    }
    else{
        inOrden(arbol->izq);
        cout<<arbol->dato<<" - ";
        inOrden(arbol->der);
    }
}

//Funcion para recorrido en profundidad postOrden
void postOrden(Nodo*arbol){
    if(arbol==NULL){
        return;
    }
    else{
        postOrden(arbol->izq);
        postOrden(arbol->der);
        cout<<arbol->dato<<" - ";
    }
}

//Funcion para destruir un nodo
void destruirNodo(Nodo*nodo){
    nodo->izq=NULL;
    nodo->der=NULL;
    delete nodo;
}

//Funcion para eliminar un nodo del arbol
void eliminar(Nodo*arbol,int n){
    if(arbol==NULL){
        return;
    }
    else if(n<arbol->dato){
        eliminar(arbol->izq,n);
    }
    else if(n>arbol->dato){
        eliminar(arbol->der,n);
    }
    else{
        eliminarNodo(arbol);
    }
}

//Funcion para reemplazar dos nodos
void reemplazar(Nodo*arbol,Nodo*nuevoNodo){
    if(arbol->padre){//arbol hay que asignarle su nuevo hijo
        if(arbol->dato=arbol->padre->izq->dato){
            arbol->padre->izq=nuevoNodo;
        }
        else if(arbol->dato==arbol->padre->der->dato){
            arbol->padre->der=nuevoNodo;
        }
    }
    if(nuevoNodo){ //procedemos a asignarle su nuevo padre
        nuevoNodo->padre=arbol->padre;
    }
}


//Funcion para eliminar el nodo encontrado
void eliminarNodo(Nodo*nodoEliminar){
    if(nodoEliminar->izq &&nodoEliminar->der){ //si tiene dos hijos
        Nodo*menor=minimo(nodoEliminar->der);
        nodoEliminar->dato=menor->dato;
        eliminarNodo(menor);
    }
    else if(nodoEliminar->izq){ //si tiene hijo izquierdo
        reemplazar(nodoEliminar,nodoEliminar->izq);
        destruirNodo(nodoEliminar);
    }
    else if(nodoEliminar->der){ //si tiene hijo derecho
        reemplazar(nodoEliminar,nodoEliminar->der);
        destruirNodo(nodoEliminar);
    }
    else{ //no tiene hijos
        reemplazar(nodoEliminar,NULL);
        destruirNodo(nodoEliminar);
    }
    
}

//Funcion para determinar nodo mas a la izquiera posible
Nodo *minimo(Nodo*arbol){
    if(arbol==NULL){ // si el arbol esta vacio
        return NULL; //retornas nulo
    }
    if(arbol->izq){//si tiene hijo izquierdo
        return minimo(arbol->izq); //buscamos la parte mas izquierda posible
    }
    else{ //si no tiene hijo izquierdo
        return arbol; //retornamos el mismo nodo
    }
}