#include <iostream>
#include "Weight.h"

using namespace std;


int main()
{
    Weight wt1 = Weight(6,6);
    Weight wt2 = Weight(2,0);

    Weight wt3 = wt1 / wt2;
    cout << wt3.getWeight()/16 << "lb " << wt3.getWeight() - (wt3.getWeight()/16)*16 << "oz" << endl;
}
