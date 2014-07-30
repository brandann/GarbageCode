#include <iostream>
int fty(int);
using namespace std;

int main()
{
    int f;
    cout << "Furlong-To-Yard" << endl;
    cout << "Enter Furlongs: ";
    cin >> f;
    cout << f << "Furlongs = " << fty(f) << " yards" << endl;
}

int fty(int f)
{
    return f * 220;
}

