/*ejercicio 3: Realice un programa de tal manera que se construya una solucion para la 
jerarquia(herenncia) de clases mostrada en la figura*/

#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

class Persona{
    private: 
        string nombre;
        int edad;
    public: 
        Persona(string,int); //constructor
        void mostrarPersona();
};

class Empleado:public Persona{
    private:
        int codigoEmpleado;
        string empresa;
    public:
        Empleado(string,int,int,string); 
        void mostrarEmpleado();
};

class Estudiante:public Persona{
    private:
        int codigoEstudiante;
        string centroEstudio;
    public:
        Estudiante(string,int,int,string);
        void mostrarEstudiante();
};

class Universitario:public Estudiante{
    private:
        float notaFinal;
    public: 
        Universitario(string,int,int,string,float);
        void mostrarNota();

};

Persona::Persona(string _nombre, int _edad){
    nombre=_nombre;
    edad=_edad;
}

Empleado::Empleado(string _nombre,int _edad, int _codigoEmpleado,string _empresa):Persona(_nombre,_edad){
    codigoEmpleado=_codigoEmpleado;
    empresa=_empresa;
}

Estudiante::Estudiante(string _nombre, int _edad, int _codigoEstudiante, string _centroEstudio):Persona(_nombre,_edad){
    codigoEstudiante=_codigoEstudiante;
    centroEstudio=_centroEstudio;
}

Universitario::Universitario(string _nombre,int _edad,int _codigoEstudiante,string _centroEstudio,float _notaFinal):Estudiante(_nombre,_edad,_codigoEstudiante,_centroEstudio){
    notaFinal=_notaFinal;
}

void Persona::mostrarPersona(){
    cout<<"Nombre: "<<nombre<<endl;
    cout<<"Edad: "<<edad<<endl;
}

void Empleado::mostrarEmpleado(){
    mostrarPersona();
    cout<<"Codigo Empleado: "<<codigoEmpleado<<endl;
    cout<<"Empresa: "<<empresa<<endl;
}

void Estudiante::mostrarEstudiante(){
    mostrarPersona();
    cout<<"Codigo Estudiante: "<<codigoEstudiante<<endl;
    cout<<"Centro de Estudios: "<<centroEstudio<<endl;
}

void Universitario::mostrarNota(){
    mostrarEstudiante();
    cout<<"Nota final: "<<notaFinal<<endl;
}

int main(){
    Empleado empleado1("Carlos",35,5765456,"alpitec");
    cout<<"-Empleado-"<<endl;
    empleado1.mostrarEmpleado();
    cout<<"\n";

    Estudiante estudiante1("Alejandro",25,4857632,"fluxtec");
    cout<<"-Estudiante-"<<endl;
    estudiante1.mostrarEstudiante();
    cout<<"\n";

    Universitario universitario1("Maria",23,6783546,"las americas",6.7);
    cout<<"-Universitario-"<<endl;
    universitario1.mostrarNota();
    cout<<"\n"<<endl;

    getch();
    return 0;
}