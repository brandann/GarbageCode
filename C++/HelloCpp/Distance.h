/* 
 * File:   Distance.h
 * Author: brandan
 *
 * Created on October 1, 2013, 1:30 PM
 */

#ifndef DISTANCE_H
#define	DISTANCE_H

class Distance {
public:
    Distance(int feet, int inch);
    Distance(const Distance& orig);
    virtual ~Distance();
private:
    int getDistance();

};

#endif	/* DISTANCE_H */

