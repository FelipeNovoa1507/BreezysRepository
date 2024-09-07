/*la programacioon orientada a objetos se basan en hacer clases (class) lo que es basicamente
una base de datos.*/
#include<iostream>
#include<conio.h>
#include<stdlib.h>
#include<string.h>
using namespace std;

class Persona{
    private: //Atributos
        int edad;
        string nombre;
    public: //metodos
        Persona(int,string); //Constructor
        ~Persona(); //Destructor
        void leer();
        void correr();
};

//Constructor, nos sirve para inicializar los atributos
Persona::Persona(int _edad,string _nombre){
    edad=_edad;
    nombre=_nombre;
}

//Destructor, nos sirve para eliminar todos los atributos
Persona::~Persona(){
}

//prototipo de funcion
void Persona::leer(){
    cout<<"Soy "<<nombre<<" y estoy leyendo un libro y tengo "<<edad<<" anos"<<endl;
}
void Persona::correr(){
    cout<<"Soy "<<nombre<<" y estoy corriendo un maraton y tengo "<<edad<<" anos"<<endl;
}

int main(){
    Persona p1(20,"Felipe"); //creando datos
    Persona p2(19,"Maria"); //creando datos
    Persona p3(21,"Juan"); //creando datos

    p1.~Persona(); //se elimina la variable p1

    p1.leer();

    p2.correr();
    p3.leer();
    p3.correr();

    getch();
    return 0;
}