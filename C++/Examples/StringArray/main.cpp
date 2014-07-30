#include <iostream>
#include <algorithm>

int main()
{
    std::string shows[] = {"Walking Dead",
                            "Breaking Bad",
                            "Firefly",
                            "Stargate",
                            "How I Met Your Mother",
                            "Battlestar Galactica"
    };

    for(std::string s : shows)
    {
        //std::cout << s << std::endl;
    }

    std::sort(begin(shows), end(shows));

    for(std::string s : shows)
    {
        std::cout << s << std::endl;
    }
}
