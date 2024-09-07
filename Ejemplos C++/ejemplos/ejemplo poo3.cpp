#include<iostream>
#include<conio.h>
using namespace std;

class Animal{
    private:
        int edad;
    public: 
        Animal(int);
        virtual void comer();
};

class Humano:public Animal{
    private:
        string nombre;
    public:
        Humano(int,string);
        void comer();
};

class Perro:public Animal{
    private:
        string raza;
        string nombre;
    public:
        Perro(int,string,string);
        void comer();

};

Animal::Animal(int _edad){
    edad=_edad;
}

Humano::Humano(int _edad,string _nombre):Animal(_edad){
    nombre=_nombre;
}

Perro::Perro(int _edad,string _raza,string _nombre):Animal(_edad){
    raza=_raza;
    nombre=_nombre;

}

void Animal::comer(){
    cout<<"Yo como"<<endl;
}

void Humano::comer(){
    cout<<"Se sento en la mesa a comer"<<endl;
}

void Perro::comer(){
    cout<<"Acerco su hocico a su plato y comio"<<endl;
}

int main(){
    Animal *animales[2];

    animales[0]=new Perro(3,"Kiltro","Kira");
    animales[1]=new Humano(21,"Felipe");

    animales[0]->comer();
    animales[1]->comer();
    getch();
    return 0;
}