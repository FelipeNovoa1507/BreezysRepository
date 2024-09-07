/*Realice un programa que calcule las soluciones de una ecuacion de segundo grado de la forma 
ax^2+bx+c=0 (-b +- raiz de b2 -4ac / 2a)*/
#include<iostream>
#include<math.h>

/*En la libreria math.h, al usar el comando 'sqrt()' se calculara la raiz cuadrada
y al usar el comando pow(,) se tomara la variable antes de la coma y se elavara al numero despues de la coma*/

using namespace std;
int main(){
    float a,b,c,resultado1=0,resultado2=0;
    cout<<"Digite el valor de a: ";cin>>a;
    cout<<"Digite el valor de b:";cin>>b;
    cout<<"Digite el valor de c:";cin>>c;
    resultado1=(-b +sqrt(pow(b,2)-4*a*c))/(2*a);
    resultado2=(-b -(sqrt(pow(b,2)-(4*a*c))))/(2*a);
    cout<<"El primer resultado es: "<<resultado1<<endl;
    cout<<"El segundo resultado es: "<<resultado2<<endl;
    return 0; 

}