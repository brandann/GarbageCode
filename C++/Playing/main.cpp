#include <iostream>

using namespace std;

int main(int n, char** args)
{
    int al = sizeof(args)/sizeof(*args);
    for(int i = 0; i <= al; i++)
    {
        cout << i+1 << "\t" << args[i+1] << endl;
    }
    return 0;
}
