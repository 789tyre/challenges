#include <iostream>
using namespace std;

int main()
{
    string strNumber;
    int number = 0;
    int counter = -1;

    while (number != counter && counter < 10){
	number = -1;
	counter++;
	cout << "Enter a number that is not " << counter << ": ";
	cin >> strNumber;
	number = atoi(strNumber.c_str());
    } 

    if (counter >= 10) {
	cout << "Wow, you're more patient then I am, you win." << endl;
	return 0;
    }

    if (number == counter){
	cout << "Hey! You weren't supposed to do that!" << endl;
    }

    return 0;
}
