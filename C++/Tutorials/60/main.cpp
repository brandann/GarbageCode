#include <iostream>

using namespace std;

template <class T>
class Brandan
{
    T first, second;
    public:
        Brandan(T a, T b)
        {
            first = a;
            second = b;
        }
        T bigger();
};

template <class T>
T Brandan<T>::bigger()
{
    return (first>second?first:second);
}
int main()
{
    Brandan <int> bran(25, 9008);
    cout << bran.bigger() << endl;
    //Brandan *bp;
    //bp = &bran;
    //cout << bp->bigger() << endl;
}
