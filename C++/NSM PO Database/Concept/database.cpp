#include <iostream>
#include <fstream>
using namespace std;

void log(string po, string job, string note)
{
    ofstream out;
    if(job.length() == 4)
        job = "NS" + job;
    string item = po + " " + job + " " + note;
    cout << "\n" << item << endl;
    out.open( "log.txt", ios::app );
    out << item << endl;
    out.close( );
}

bool getpo(string in)
{
    return in.length() == 6;
}

bool getjob(string in)
{
    return in.length() == 4;
}

int main(){
    bool go = true;
    cout << "PO Log" << endl;
    while(go){
        string po;
        string job;
        string note;
        while(!getpo(po))
        {
            cout << "Enter PO Number: ";
            cin >> po;
        }
        while(!getjob(job))
        {
            cout << "Enter Job Number: ";
            cin >> job;
        }

        cout << "Enter Note: ";
        cin >> note;

        log(po, job, note);
        po = job = note = "";
    }
}
