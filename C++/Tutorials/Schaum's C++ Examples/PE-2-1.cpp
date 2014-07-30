#include <iostream>
int getFeet(int);
int getInch(int);
using namespace std;

int main()
{
    cout << "Welcome!" << endl;
    cout << "Please Enter Your Height (inches): _____\b\b\b\b\b";
    int heightInches;
    cin >> heightInches;
    cout << "You are " << getFeet(heightInches) << " feet, and ";
    cout << getInch(heightInches) << " inches tall!" << endl;
}

int getFeet(int i)
{
    const int FEET_CONV = 12;
    return (int) i / FEET_CONV;
}

int getInch(int i)
{
    const int FEET_CONV = 12;
    return i - ((i / FEET_CONV) * FEET_CONV);
}
