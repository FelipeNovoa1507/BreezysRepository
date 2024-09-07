#include<iostream>
#include<conio.h>
using namespace std;
struct atleta{
    char nombre[20],pais[20];
    int n_medallas;
}atl[100];

int main(){
    int posm=0,mayor=0,n_atl;  
    cout<<"Digite el numero de atletas: ";
    cin>>n_atl;
    for(int i=0;i<n_atl;i+=1){
        fflush(stdin);
        cout<<"Digite su nombre"<<endl;
        cin.getline(atl[i].nombre,20,'\n');
        cout<<"Digite su pais"<<endl;
        cin.getline(atl[i].pais,20,'\n');
        cout<<"Digite su numero de medallas"<<endl;
        cin>>atl[i].n_medallas;
        cout<<"\n";
        if(atl[i].n_medallas>mayor){
            mayor=atl[i].n_medallas;
            posm=i;
        }
    }
    cout<<"El atleta con mayor numero de medallas es: "<<atl[posm].nombre<<endl;
    cout<<"Pais: "<<atl[posm].pais<<endl;
    cout<<"\n";
    getch();
    return 0;
}