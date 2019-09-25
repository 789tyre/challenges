#include <iostream>
using namespace std;

int main(int argc, char ** argv)
{
    int grade;

    cout << "Enter your grade for programming (0-100): " << endl;
    cin >> grade;

    if (grade == 100){
	cout << "Congratulations. You got a perfect score." << endl;
    }

    switch(grade){
	case 90 ... 100:
	    cout << "You got an A" << endl;
	    break;
	case 80 ... 89:
	    cout << "You got a B" << endl;
	    break;
	case 70 ... 79:
	    cout << "You got a C" << endl;
	    break;
	case 60 ... 69:
	    cout << "You got a D" << endl;
	    break;
	default:
	    cout << "You got an F" << endl;
    }

    return 0;
}
