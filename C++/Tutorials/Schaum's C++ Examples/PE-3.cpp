#include <iostream>
void three();
void see();
using namespace std;

int main()
{
    three();
    three();
    see();
    see();
}

void three()
{
    cout << "Three blind mice" << endl;
}

void see()
{
    cout << "See how they run" << endl;
}
