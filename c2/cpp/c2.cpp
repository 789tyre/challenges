#include <iostream>

int main(){
    int choice;
    std::cout << "\n1. Water\n2. Coca Cola\n3. Pepsi\n4. Pepno\n5. 7Up\n";
    std::cout << "Enter your drink selection:" << std::endl;

    std::cin >> choice;
    /* switch(choice){ */
	/* case 1: */
	    /* std::cout << "You chose water." << std::endl; */
	    /* break; */
	/* case 2: */
	    /* std::cout << "You got Coca Cola" << std::endl; */
	    /* break; */
	/* case 3: */
	    /* std::cout << "Si, I will deliver" << std::endl; */
	    /* break; */
	/* case 4: */
	    /* std::cout << "Pepno, really? Sure" << std::endl; */
	    /* break; */
	/* case 5: */
	    /* std::cout << "7Up coming down" << std::endl; */
	    /* break; */
	/* default: */
	    /* std::cout << "Error. choice was not valid, here is your money back." << std::endl; */
    /* } */

    if (choice == 1){
	std::cout << "You chose water." << std::endl;
    } else if (choice == 2){
	std::cout << "You got Coca Cola" << std::endl; 
    } else if (choice == 3){
	std::cout << "Si, I will deliver" << std::endl;
    } else if (choice == 4){
	std::cout << "Pepno, really? Sure" << std::endl;
    } else if (choice == 5){
	std::cout << "7Up coming down" << std::endl;
    } else {
	std::cout << "Error. choice was not valid, here is your money back." << std::endl;	
    }

}
