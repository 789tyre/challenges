#include <iostream>

int main()
{
    int pancakes[10];
    int person[10];
    char input[10];
    int Iinput;
    bool hasSwapped = true;

    //Let's get the info on the pancakes!
    for (int i = 0; i < 10; i++)
    {
	pancakes[i] = -1;
	person[i] = i;

	while (pancakes[i] == -1){
	    try
	    {
		std::cout << "How many pancakes did Person " << i + 1 << " eat?: ";
		std::cin >> input;
		Iinput = std::stoi(input);
		pancakes[i] = Iinput;
	    } catch (const std::invalid_argument e)
	    {
		std::cout << "That's invalid" << std::endl;
		pancakes[i] = -1;
	    }
	}

    }

    //Let's sort out some pancakes! (bubble sort)
    while (hasSwapped)
    {
	hasSwapped = false;
	for(int i = 1; i < 10; i++)
	{
	    if (pancakes[i-1] < pancakes[i])
	    {
		int tempPancakes = pancakes[i-1];
		int tempPerson = person[i-1];

		pancakes[i-1] = pancakes[i]; //Swap the number of pancakes
		pancakes[i] = tempPancakes;

		person[i-1] = person[i]; //Swap the corresponding person
		person[i] = tempPerson;

		hasSwapped = true;
	    }
	}
    }

    for(int i = 0; i < 10; i++)
    {
	if (pancakes[i] == 1)
	{
	    std::cout << "Person " << person[i] + 1 << ": " << pancakes[i] << " pancake" << std::endl;
	} else {
	    std::cout << "Person " << person[i] + 1 << ": " << pancakes[i] << " pancakes" << std::endl;
	}
    }
    
    std::cout << "Person " << person[0] + 1 << " ate the most pancakes." << std::endl;
    std::cout << "Person " << person[9] + 1 << " ate the least pancakes." << std::endl;

    return 0;
}
