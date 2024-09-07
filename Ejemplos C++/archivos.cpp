#include<iostream>
#include<fstream>
#include<stdlib.h>
#include<conio.h>
#include<string.h>
using namespace std;

void escribir(); //Funcion para escribir texto en un archivo
void lectura(); //Funcion para leer un archivo
void anadir(); //Funcion para anadir texto a un archivo preexistente

int main(){
    //escribir();
    lectura();
    anadir();
    getch();
    return 0;
}

void escribir(){ //Funcion para crear/abrir y redactar un archivo de texto
    ofstream archivo;
    string nombreArchivo,frase;

    cout<<"Digite el nombre del archivo";
    getline(cin,nombreArchivo);

    archivo.open(nombreArchivo.c_str(),ios::out); //si el archivo existe lo abre, si no existe lo crea

    if(archivo.fail()){
        cout<<"No se pudo abrir el archivo";
        exit(1);
    }

    cout<<"\nDigite el texto del archivo: ";
    getline(cin,frase);

    archivo<<frase; 

    archivo.close(); //cerrando el archivo

}

void lectura(){ //Funcion para leer un archivo
    ifstream archivo;
    string texto;

    archivo.open("holaquetal.txt",ios::in); //abrimos el archivo en modo lectura

    if(archivo.fail()){
            cout<<"No se pudo abrir el archivo";
            exit(1);
    }
    
    while(!archivo.eof()){ //mientras no sea el final del archivo
        getline(archivo,texto);
        cout<<texto<<endl;
    }

    archivo.close(); //cerramos el programa
}

void anadir(){ //Funcion para anadir texto a un archivo
    ofstream archivo;
    string texto; 

    archivo.open("holaquetal.txt",ios::app); //abrimos el archivo en modo anadir

    if(archivo.fail()){
            cout<<"No se pudo abrir el archivo";
            exit(1);
    }

    cout<<"Digite el texto que quiere anadir: ";
    getline(cin,texto);

    archivo<<texto<<endl;

    archivo.close(); //cerramos el archivo
    
}