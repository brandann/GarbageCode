#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      brandan
#
# Created:     13/09/2013
# Copyright:   (c) brandan 2013
# Licence:     <your licence>
#-------------------------------------------------------------------------------

def main():
    shows = ["Walking Dead",
             "Breaking Bad",
             "Firefly",
             "Stargate",
             "How I Met Your Mother",
             "Battlestar Galactica"]
    for s in shows:
        print s
    shows.sort()
    for s in shows:
        print s

if __name__ == '__main__':
    main()
