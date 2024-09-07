/*ejercicio 11: Hacer una estructura llamada alumno, en la cual se tendran los siguientes
campos: Nombre, edad, promedio, pedir datos al usuario para 3 alumnos, comprobar cual de los 
3 tiene el mejor promedio y posteriormente imprimir los datos del alumno.
NOTA: Usar punteros a estructura. */

#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;

struct Alumno{
    char nombre[20];
    int edad;
    float promedio;
}alumno[3], *puntero_alumno=alumno;

void pedirDatos();
void calcularMejorPromedio(Alumno *);

int main(){
    pedirDatos();
    calcularMejorPromedio(puntero_alumno);



    getch();
    return 0;    
}

void pedirDatos(){

    for(int i=0;i<3;i++){
        fflush(stdin);
        cout<<"Digite su nombre: ";
        cin.getline((puntero_alumno+i )->nombre,20,'\n');
        cout<<"Digite su edad: ";
        cin>>(puntero_alumno+i)->edad;
        cout<<"Digite su promedio: ";
        cin>>(puntero_alumno+i)->promedio;
        cout<<"\n\n";

    }

}

void calcularMejorPromedio(Alumno *puntero_alumno){
    float mejor=0.0;
    int pos=0;

    for(int i=0;i<3;i++){
        if((puntero_alumno+i)->promedio>mejor){
            mejor=(puntero_alumno+i)->promedio;
            pos=i;        
        }
    }
    cout<<"\n\nDatos del mejor alumno: \n\n";
    cout<<"Nombre: "<<(puntero_alumno+pos)->nombre<<endl;
    cout<<"Edad: "<<(puntero_alumno+pos)->edad<<endl;
    cout<<"Promedio: "<<(puntero_alumno+pos)->promedio<<endl;
}
