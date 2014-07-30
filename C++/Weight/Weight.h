#ifndef WEIGHT_H
#define WEIGHT_H
#include <iostream>

using namespace std;

class Weight
{
    public:
        Weight(int p, int o);
        int getWeight();
        int getPounds();
        int getOunces();
        Weight operator+(Weight w1);
        Weight operator-(Weight w1);
        Weight operator*(Weight w1);
        Weight operator/(Weight w1);
        virtual ~Weight();
    protected:
    private:
        void setWeight(int p, int o);
        int lb;
        int oz;
};

#endif // WEIGHT_H
