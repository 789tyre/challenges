people = []
pancakes = []

#Input for number of pancakes
for i in range(10):
    people.append(i + 1)
    pancakes.append(-1)
    while pancakes[i] == -1:
        try:
            pancakes[i] = int(input("How many pancakes did Person {} eat?:".format(i + 1)))
        except:
            print("That's not valid")
            pancakes[i] = -1

#Sort out the pancakes
hasSwapped = True
while hasSwapped:
    hasSwapped = False
    for i in range(1, len(pancakes)):
        if (pancakes[i-1] < pancakes[i]):
            pancakes[i-1], pancakes[i] = pancakes[i], pancakes[i-1]
            people[i-1], people[i] = people[i], people[i-1]
            hasSwapped = True;

#Output the results
print()
for i in range(len(pancakes)):
    if pancakes[i] == 1:
        print("Person %d: %d pancake" % (people[i], pancakes[i]))
    else:
        print("Person %d: %d pancakes" % (people[i], pancakes[i]))
print("Person {} ate the most pancakes".format(people[0]))
print("Person {} ate the least pancakes".format(people[len(people) - 1]))
