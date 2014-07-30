#include <iostream>
int yearToMonth(int);
using namespace std;

int main()
{
    int age;
    cout << "Enter your age: ";
    cin >> age;
    cout << "\nYour age in months is " << yearToMonth(age) << endl;
}

int yearToMonth(int a)
{
    return a * 12;
}
