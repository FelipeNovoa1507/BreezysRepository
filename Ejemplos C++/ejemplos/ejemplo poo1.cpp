/*ejercicio 1: construya una clase llamada rectangulo que tenfa los siguientes atributos:
largo y ancho, y los siguientes metodos: perimetro() y area()*/
#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;

class Rectangulo{
    private: //Atributos
        float largo;
        float ancho;
    public: //metodos
        Rectangulo(float,float); //constructor
        void perimetro(float, float);
        void area(float,float);
};

Rectangulo::Rectangulo(float _largo, float _ancho){
    largo=_largo;
    ancho=_ancho;
}

void Rectangulo::perimetro(float a, float b){
    cout<<"El perimetro del rectangulo es: "<<(a+b)*2<<" centimetros"<<endl;
}

void Rectangulo::area(float a, float b){
    cout<<"El area del rectangulo es: "<<a*b<<" centimetros."<<endl;
}

int main(){
    float largo=0;
    float ancho=0;
    Rectangulo p1(0,0);

    cout<<"Digite el largo del rectangulo: ";
    cin>>largo;
    
    cout<<"Digite el ancho del rectangulo: ";
    cin>>ancho;

    p1.perimetro(largo,ancho);
    p1.area(largo,ancho);



    getch();
    return 0;
}
