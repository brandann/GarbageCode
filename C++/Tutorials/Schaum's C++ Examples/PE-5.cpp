#include <iostream>
int celsiusToFahrenheit(int);
using namespace std;

int main()
{
    int celsius;
    cout << "Enter a celsius value: ";
    cin >> celsius;
    cout << celsius << " degrees celsius is " << celsiusToFahrenheit(celsius) << " degrees fahrenheit" << endl;
}

int celsiusToFahrenheit(int c)
{
    return c * 1.8 + 32;
}

