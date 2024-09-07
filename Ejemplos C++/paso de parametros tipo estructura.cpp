#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
struct persona{
    char nombre[30];
    int edad;
}p1;

//Prototipo
void pedirDatos();
void mostrarDatos(persona);


int main(){
    pedirDatos();
    mostrarDatos(p1);

    getch();
    return 0;
}

void pedirDatos(){
    cout<<"Digite su nombre: ";
    cin.getline(p1.nombre,30,'\n');
    cout<<"Digite su edad: ";
    cin>>p1.edad;
}

void mostrarDatos(persona p){
    cout<<"\n\nNombre: "<<p.nombre<<endl;
    cout<<"Edad: "<<p.edad<<endl;
}