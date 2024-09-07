#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;

struct persona{
    char nombre[30];
    int edad;
}persona1, *puntero_persona1=&persona1;

void pedirDatos(); //Prototipo de funcion
void mostrarDatos(persona *);

int main(){
    pedirDatos();
    mostrarDatos(puntero_persona1);


    getch();
    return 0;
}

void pedirDatos(){
    cout<<"Digite su nombre: ";
    cin.getline(puntero_persona1->nombre,30,'\n');
    cout<<"Digite su edad: ";
    cin>>puntero_persona1->edad;

}

void mostrarDatos(persona *puntero_persona1){
    cout<<"\nSu nombre: "<<puntero_persona1->nombre<<endl;
    cout<<"Su edad es: "<<puntero_persona1->edad<<endl;
}