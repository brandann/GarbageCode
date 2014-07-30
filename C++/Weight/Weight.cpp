#include "Weight.h"
#include <iostream>


Weight::Weight(int p, int o)
{
    setWeight(p,o);
}

void Weight::setWeight(int p, int o)
{
    lb = p + o/16;
    oz = o - ((int) o/16)*16;
}

int Weight::getWeight()
{
    return lb*16 + oz;
}

int Weight::getPounds()
{
    return lb;
}

int Weight::getOunces()
{
    return oz;
}

Weight Weight::operator+(Weight w1)
{
    int wlb = lb + w1.getPounds();
    int woz = oz + w1.getOunces();
    Weight w(wlb, woz);
    return w;
}

Weight Weight::operator-(Weight w1)
{
    int wlb = lb - w1.getPounds();
    int woz = oz - w1.getOunces();
    Weight w(wlb, woz);
    return w;
}

Weight Weight::operator*(Weight w1)
{
    int wlb = lb * w1.getPounds();
    int woz;
    if(oz == 0)
        woz = w1.getOunces();
    else if(w1.getOunces() == 0)
        woz = oz;
    else
        woz = oz * w1.getOunces();
    Weight w(wlb, woz);
    return w;
}

Weight Weight::operator/(Weight w1)
{

    float weight1 = lb*16 + oz;
    float weight2 = w1.getPounds()*16 + w1.getOunces();
    float fweight = weight1/weight2;
    int iweight = fweight;
    int wlb = iweight;
    int woz = (fweight - iweight) * 16;
    Weight w(wlb, woz);
    return w;
}

Weight::~Weight()
{
    //dtor
}
