#include <iostream>
#include <time.h>
using namespace std;

void guessGame(void)
{
    //Here the human will guess the number
    int cnum = rand() % 100 + 1;
    string strhnum;
    int hnum = 0;
    int guesses = 0;

    while (hnum != cnum)
    {
	guesses++;
	cout << "Guess my number: ";
	cin >> strhnum;
	hnum = atoi(strhnum.c_str()); 

	if (hnum == cnum) {
	    cout << "\nYou guessed it right!" << endl;
	} else if (hnum < cnum) {
	    cout << "\nToo low" << endl;
	} else if (hnum > cnum) {
	    cout << "\nToo high" << endl;	
	}
    }
    cout << "You guessed " << cnum << " in " << guesses << " guesses" << endl;
}

void reverseGuessGame(void)
{
    //Here the computer will guess the number
    int cnum = rand() % 100 + 1;
    int upperLimit = 101;
    int lowerLimit = 0;

    string strHnum = "";
    int hnum; //Either 1 ( too low ), 2 ( too high ) or 3 ( just right ). 
    cout << "Pick a number between 1-100 and I will try to guess it." << endl;

    while (hnum != 3)
    {
	strHnum = "";
	cout << "Is your number " << cnum << "?" << endl;
	while (strHnum == "") //Get input
	{
	    cout << "\n1. Too low\n2. Too High\n3. Correct" << endl;
	    cin >> strHnum;
	    hnum = atoi(strHnum.c_str());
	    if (hnum < 0 || hnum > 3)
	    {
		cout << "That's not valid" << endl;
		strHnum = "";
	    }
	}
	switch(hnum)
	{
	    case 1: 
		lowerLimit = cnum;
		break;
	    case 2: 
		upperLimit = cnum;
		break;
	    case 3: 
		cout << "Yay! I got it right!" << endl; 
		break;
	    default: 
		cout << "I should not be here" << endl; 
		break;
	}
	cnum = ((upperLimit - lowerLimit) / 2) + lowerLimit;
    }
    

}

int main()
{
    srand(time(NULL));

    string choice = "";
    int intChoice;

    while (choice == "")
    {

	cout << "What do you want to do?" << endl;
	cout << "\n1. Guess a number (1-100)\n2. Make the computer guess a number between 1 and 100" << endl;
	cin >> choice;
	intChoice = atoi(choice.c_str());

	if (intChoice < 1 || intChoice > 2)
	{
	    cout << "That's not a choice" << endl;
	    choice = "";
	}

    }
    switch ( intChoice ){
	case 1: guessGame(); break;
	case 2: 
	default: reverseGuessGame(); break;
    }
}
