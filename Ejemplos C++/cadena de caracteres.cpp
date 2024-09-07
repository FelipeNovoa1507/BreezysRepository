#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
int main(){
    int longitud=0;
    char nombre[20];
    char nombre2[20];
    char nombre3[]={" pro"};
    cout<<"Digite su nombre: ";
    cin.getline(nombre,20,'\n');
    cout<<nombre<<endl;
    /*no se puede usar cin, ya que cin 
    deja de leer al primer espacio que encuentre*/
    longitud=strlen(nombre);
    cout<<"Numero de la cadena de caracteres es: "<<longitud<<endl;
    strcpy(nombre2,nombre);
    cout<<"copia "<<nombre2<<endl; 
    /*strcpy() sirve para copiar una cadena de caracteres a otro array*/
    if(strcmp(nombre,nombre2)==0){
        cout<<"Ambas cadenas son iguales"<<endl;
    }
    /*strcmp() sirve para comparar dos cadenas de caracteres*/
    strcat(nombre2,nombre3);
    cout<<nombre2<<endl;
    /*strcat() sirve para unir dos cadenas de caracteres*/
    strrev(nombre2);
    cout<<nombre2<<endl;    
    /*strrev() sirve para invertir una cadena de caracteres*/
    strupr(nombre);
    cout<<nombre<<endl;
    /*strupr() sirve para poner todas las letras de la cadena de caracteres en mayusculas*/
    strlwr(nombre);
    cout<<nombre<<endl;
    /*strlwr() sirve para poner todas las letras de una cadena de caracteres en minusculas*/
    getch();
    return 0;
}

//gets() lee mas espacios de los indicados al crear el array