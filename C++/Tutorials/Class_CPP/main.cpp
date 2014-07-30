#include <iostream> //typical to include for all programs
#include "Burrito.h"
#include <cmath> //math class - pow()
#include <cstdlib> // random numbers
#include <ctime> //time for seeding the random generator

using namespace std;
int volume(int l=1, int w=1, int h=1);

void printArray(int theArray[], int sizeOfArray)
{
    for (int i=0;i<sizeOfArray;i++)
    {
        cout << theArray[i] << endl;
    }
}
int factorialFinder(int x)
{
    if(x == 1)
    {
        return 1;
    }
    else
    {
        return x * factorialFinder(x-1);
    }
}
void printNumber(int x)
{
    cout << "I am printing an integer " << x << endl;
}
void printNumber(float x)
{
    cout << "I am printing a float " << x << endl;
}
int tuna = 69;

class MY_CLASS{
    public:
        MY_CLASS()
        {
            cout << "Thanks for making an instance of this class\nEnjoy your new Object!" << endl;
        }
        void coolSaying(){
            cout << name << "'s preachin to the choir!" << endl;
        }
        void setName(string i)
        {
            name = i;
        }
        string getName()
        {
            return name;
        }
    private:
        string name;

};

int main()
{
    MY_CLASS myObject;
    myObject.setName("Brandan");
    myObject.coolSaying();
    Burrito b;
    cout << "Hello world!" << endl;

    int i = 0;
    while(i < 3)
    {
        cout << i << endl;
        i++;
    }

    int z = 0;
    int sum = 0;
    int in = 0;

    while(z<3)
    {
        cout << "Enter a number" << endl;
        cin >> in;
        sum = sum + in;
        in = 0;
        z++;
    }
    cout << "Sum: " << sum << endl;

    cout << "\nAGE AVERAGER\n" << endl;

    int age;
    int ageTotal = 0;
    int numberOfPeople = 0;

    cout << "Enter the first persons age or -1 to quit" << endl;
    cin >> age;

    while (age != -1)
    {
        ageTotal += age;
        numberOfPeople++;
        cout << "Enter anouther age" << endl;
        cin >> age;
    }
    if(numberOfPeople>0)
    {
        cout << "Average: " << ageTotal/numberOfPeople << endl;
    }

    float PER = .01;
    float pri = 10000;
    float amount;
    for (int day = 1; day <= 20; day ++)
    {
        //random numbers!
        amount = pri * pow(1+PER, day);
        cout << day << "-----" << amount << endl;
    }

    srand(time(0));
    for(int x = 0; x <25; x++)
    {
        cout << rand() << ", ";
    }
    cout << "\n";

    for(int x = 0; x <25; x++)
    {
        //only random numbers 1-6
        cout << 1+(rand()%6) << ", ";
    }

    cout << "\n\n\nVolume: " << volume(5,10) << endl;

    int tuna = 30;
    cout << "Local: " << tuna << endl;
    cout << "Global: " << ::tuna << endl;

    int a = 54;
    float f = 30.1235;

    printNumber(a);
    printNumber(f);

    int rand_factorial = 1+(rand()%10);
    cout << rand_factorial << ": " << factorialFinder(rand_factorial) << endl;



    int intArray[88];
    for(int s = 0;s<88;s++)
    {
        intArray[s] = (s*s*s)*2%10;
    }

    printArray(intArray,88);

    return 0;
}

int volume(int l, int w, int h)
{
    return l*w*h;
}
