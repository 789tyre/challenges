#While (user == gulliable)

number = 0 
counter = -1 
while(number != counter and counter < 10):
    counter += 1
    try:
        number = int(input("Enter a number that is not {}: ".format(counter)))
    except (ValueError):
        print("That is not a number")

if(number == counter):
    print("Hey! You weren't supposed to do that!")
    exit()

if (counter >= 10):
    print("You have more patience than me. You win")
    exit()
