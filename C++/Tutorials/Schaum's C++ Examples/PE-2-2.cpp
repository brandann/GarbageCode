#include <iostream>
#include <cmath>
using namespace std;

const int INCH_PER_FOOT = 12;
const double I2M = .0254;
const double lb2kg = 2.2;
int hFeet;
double hInch;
double wLB;
double heightInInches;
double heightInMeters;
double massInKillograms;
double BMI;

int main()
{
    cout << "BMI Calculator\n" << endl;
    cout << "Please Enter Your Height" << endl;
    cout << "Feet: ";
    cin >> hFeet;
    cout << "Inches: ";
    cin >> hInch;
    cout << "\nEnter your weight in pounds" << endl;
    cout << "Weight (lb): ";
    cin >> wLB;
    heightInInches = hFeet * INCH_PER_FOOT + hInch;
    heightInMeters = heightInInches * I2M;
    massInKillograms = wLB / lb2kg;
    BMI = massInKillograms / pow(heightInMeters,2);

    cout << "\nBMI: " << BMI;
    if(BMI < 18.5)
        cout << " (Underweight)" << endl;
    else if((BMI >= 18.5) || (BMI < 25))
        cout << " (Normal weight)" << endl;
    else if((BMI >= 25) || (BMI < 30))
        cout << " (Overweight)" << endl;
    else
        cout << " (Obesity)" << endl;
}

