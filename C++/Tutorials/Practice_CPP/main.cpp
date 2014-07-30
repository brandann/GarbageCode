#include <iostream>

using namespace std;

int main()
{
    int num = 0;
    bool guessed = false;
    int guesses = 5;
    int guess;
    cout << "Welcome! you have " << guesses << " to guess the correct number!" << endl;
    cin >> guess;
    while(!guessed || guesses > -1)
    {
        if(guess > num)
        {
            cout << "Your guess of " << guess << " is too high!" << endl;
            guesses--;
        }
        else if (guess < num)
        {
            cout << "Your guess of " << guess << " is too low" << endl;
            guesses--;
        }
        else
        {
            cout << "Yay! " << num << " is the correct number :)" << endl;
            break;
            //guessed = !guessed;
        }
        if(!guessed)
        {
            cout << "Try again, you have " << guesses << " left!" << endl;
            cin >> guess;
        }
    }
}
