//HelloClass.cpp

#include "HelloClass.h"
#include <iostream>

using namespace std;

HelloClass::HelloClass() {}

HelloClass::~HelloClass() {}

string HelloClass::getHello()
{
    return "Hello World, from HelloClass";
}
