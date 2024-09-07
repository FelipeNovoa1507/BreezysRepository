#include <iostream>
#include <fstream>
#include <vector>
#include <cstdlib>
using namespace std;

int main() {
    int elemento;
    int numero;
    vector<int> miVector;
    
    ifstream archivo("vector.txt");
    if (!archivo) {
        cerr << "No se pudo abrir el archivo." << endl;
        return 1; 
    }

    cout << "Ingrese un numero a buscar en el vector: ";
    cin >> numero;
    fflush(stdin);
    // Verificar si el número está en el vector
    bool encontrado = false;
    for (size_t i = 0; i < miVector.size(); ++i) {
        if (miVector[i] == numero) {
            cout << "\nEl numero " << numero << " esta en la posicion " << i << " del vector." << endl;
            encontrado = true;
            break;  // Salir del bucle una vez que se encuentra el número
        }
    }

    // Si el número no está en el vector
    if (!encontrado) {
        cout << "\nEl numero " << numero << " no esta en el vector." << endl;
    }

    return 0;
}
