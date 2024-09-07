//Herencia en POO

#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

class Persona{
    private: //Atributos
        string nombre;
        int edad;
    public: //Metodos
        Persona(string,int); //Constructor
        void mostrarPersona();
};

class Alumno:public Persona{
    private: 
        string codigoAlumno;
        float notaFinal;
    public:
        Alumno(string,int,string,float); //Constructor de la clase alumno
        void mostrarAlumno();
};

//Constructor de la clase Persona(Clase Padre)
Persona::Persona(string _nombre,int _edad){
    nombre=_nombre;
    edad=_edad;
}

Alumno::Alumno(string _nombre,int _edad,string _codigoAlumno,float _notaFinal):Persona(_nombre,_edad){
    codigoAlumno=_codigoAlumno;
    notaFinal=_notaFinal;
}

void Persona::mostrarPersona(){
    cout<<"Nombre: "<<nombre<<endl;
    cout<<"Edad: "<<edad<<endl;
}

void Alumno::mostrarAlumno(){
    mostrarPersona();
    cout<<"Codigo Alumno: "<<codigoAlumno<<endl;
    cout<<"Nota final: "<<notaFinal<<endl;
}

int main(){
    Alumno alumno1("Felipe",21,"81641903",6.7);

    alumno1.mostrarAlumno();

    getch();
    return 0;
}