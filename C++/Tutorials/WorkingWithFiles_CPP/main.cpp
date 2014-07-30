#include <iostream>
#include <fstream>

using namespace std;

int main()
{
    int idNumber;
    string name;
    double money;
    /*
    ofstream brandansFile;
    brandansFile.open("tuna.txt");
    brandansFile << "Brandan,Haertel,2013" << endl;
    brandansFile.close();

    cout << "Enter players ID, Name, and Money" << endl;
    cout << "Press Ctrl+Z to quit\n" << endl;



    ofstream theFile("players.txt");
    while(cin >> idNumber >> name >> money)
    {
        theFile << idNumber << " " << name << " " << money << endl;
    }

    theFile.close();
    */
    idNumber = 0;
    name = "";
    money = 0.0;

    ifstream inFile("players.txt");

    while(inFile >> idNumber >> name >> money)
    {
        cout << "ID Number: \t" << idNumber << endl;
        cout << "Name: \t\t" << name << endl;
        cout << "Money: \t\t$" << money << "\n" << endl;
    }


}
