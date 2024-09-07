/*Realice un programa que solicite al usuario que piense u nnumero entero
entre el 1 y el 100. El programa debe generar un numero aleatorio en ese mismo
rango[1-100], e indicarle al usuario si el numero que digito es menor o mayor
al numero aleatorio, asi hasta que lo adivine. y por ultimo mostrarle el numero
de intentos que le llevo.*/
#include<iostream>
#include<conio.h>
#include<time.h>
using namespace std;

int main(){
    int numero,dato,contador=0;
    srand(time(NULL)); //generar un numero aleatorio;
    dato=1+rand()%(100); //25

    do{
        cout<<"Digite un numero: "; cin>>numero; //15
        if(numero>dato){
            cout<<"\nDigite un numero menor\n";
        }
        if(numero<dato){
            cout<<"\nDigite un numero mayor\n";
        }
        contador++;
    }while(numero!=dato);
    cout<<"\nFELICIDADES ADIVINASTE EL NUMERO\n";
    cout<<"Numero de intentos: "<<contador<<endl;
    getch();
    return 0;
}