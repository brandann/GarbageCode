#include <iostream>
using namespace std;

const long long SPD = 60 * 60 * 24;
const long long SPH = 60 * 60;
const long long SPM = 60;

long long time;
int seconds;
int minutes;
int hours;
int days;

int main()
{
    while (true)
    {
        cout << "Enter the number of seconds: ";
    cin >> time;
    cout << time;
    days = time / SPD;
    time = time - days * SPD;

    hours = time / SPH;
    time = time - hours * SPH;

    minutes = time / SPM;
    time = time - minutes * SPM;

    seconds = time;

    cout << " seconds = " << days << " days, ";
    cout << hours << " hours, " << minutes << " minutes, ";
    cout << seconds << " seconds.\n" << endl;

    }

}
