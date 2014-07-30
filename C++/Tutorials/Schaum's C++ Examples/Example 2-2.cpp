#include <iostream>
using namespace std;
int main()
{
    char c;
    cout << "Enter Character to get int value: ";
    cin >> c;
    while(true)
    {
        cout << "c = " << c << ", int(c) = " << int(c) << endl;
        cout << "Enter anouther number: ";
        cin >> c;
    }
    return 0;
}
