#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;

struct promedio{
    float nota1,nota2,nota3;
};

struct alumno{
    char nombre[20],sexo[10];
    int edad;
    struct promedio prom;
}alumno1;

int main(){
    float promedio_alumno;

    cout<<"Digite su nombre: ";
    cin.getline(alumno1.nombre,20,'\n');
    cout<<"Digite su sexo: ";
    cin.getline(alumno1.sexo,10,'\n');
    cout<<"Digite su edad: ";
    cin>>alumno1.edad;

    cout<<"\n.:Notas del Alumno:.\n";
    cout<<"Nota1: "; cin>>alumno1.prom.nota1;
    cout<<"Nota2: "; cin>>alumno1.prom.nota2;
    cout<<"Nota3: "; cin>>alumno1.prom.nota3;

    promedio_alumno=(alumno1.prom.nota1+alumno1.prom.nota2+alumno1.prom.nota3)/3;
    cout<<"\nDatos del Alumno\n";
    cout<<"Nombre: "<<alumno1.nombre<<endl;
    cout<<"Sexo: "<<alumno1.sexo<<endl;
    cout<<"Edad: "<<alumno1.edad<<endl;
    cout<<"Promedio: "<<promedio_alumno<<endl;

    getch();
    return 0;
}