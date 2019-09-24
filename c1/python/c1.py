grade = int(input("Enter your grade for programming (0-100): "))
if grade == 100:
    print("Congratulations! You got a perfect score!")

if grade >= 90 and grade <=100:
    print("You got an A ")
elif grade >= 80 and grade < 90:
    print("You got a B")
elif grade >= 70 and grade < 80:
    print("You got a C")
elif grade >= 60 and grade < 70:
    print("You got a D")
else:
    print("You got an F")

