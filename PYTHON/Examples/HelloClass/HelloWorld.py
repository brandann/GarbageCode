#-------------------------------------------------------------------------------
# Name:        HelloWorld.py
# Purpose:     prints "Hello Python, from HelloClass"
#
# Author:      brandan
#
# Created:     09/09/2013
#-------------------------------------------------------------------------------
from HelloClass import sayHello

# Main
def main():
    print(sayHello())
    raw_input("Press Enter to exit...")

if __name__ == '__main__':
    main()
