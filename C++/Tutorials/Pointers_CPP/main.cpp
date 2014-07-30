#include <iostream>
#include "Sally.h"
#include "People.h"
#include "Birthday.h"
using namespace std;

void passByReference(int *x)
{
    *x = 66;
}

void passByValue(int x)
{
    x = 99;
}
int main()
{
    int fish = 5;
    // &fish is the memory address of fish
    cout << &fish << endl;

    //pointer
    int *fishPointer;
    fishPointer = &fish;
    cout << fishPointer << endl;

    ///////////////////////////////////////////

    int betty = 13;
    int sandy = 13;

    passByValue(betty);
    passByReference(&sandy);
    cout << "betty is now " << betty << endl;
    cout << "sandy is now " << sandy << endl;

    /////////////////////////////////////////////

    cout << sizeof(fish) << endl;
    cout << sizeof(*fishPointer) << endl;

    //////////////////////////////////////////////

    int brandan[5];
    int *bp0 = &brandan[0];
    int *bp1 = &brandan[1];
    int *bp2 = &brandan[2];

    cout << "bp0 is at " << bp0 << endl;
    cout << "bp1 is at " << bp1 << endl;
    cout << "bp2 is at " << bp2 << endl;

    bp0 += 2;
    cout << "bp0 is now at " << bp0 << endl;

    Sally sallyObject;
    Sally *sallyPointer = &sallyObject;

    sallyObject.printCrap();
    sallyPointer->printCrap();

    const Sally constObj;
    constObj.printshiz();

    ///////////////////////////////////////////////
    int asdf = 0;
    int *p = &asdf;

    for(int i=0;i<100;i++)
    {
        cout << (p-i) << endl;
    }

    ///////////////////////////////////////////////
    Birthday birthObj(11,10,1987);
    People bh("Brandan haertel", birthObj);
    bh.printInfo();

}
