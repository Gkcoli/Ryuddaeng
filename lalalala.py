year = int(input("Enter your year: "))

age = 2022 - int(year)

if int (age) <= 99 and int(age) >= 75:
    print("You are:", age, ",you might find Jazz music interesting")
elif int(age) <=74 and int(age) >= 64:
     print("You are:", age, ",you might find Country music interesting")
elif int(age) <=63 and int(age) >= 55:
    print("You are:", age, ",you might find Rock music interesting")
elif int(age) <=54 and int(age) >= 45:
    print("You are:", age, ",you might find Disco music interesting")
elif int(age) <=44 and int(age) >= 36:
     print("You are:", age, ",you might find Pop music interesting")
elif int(age) <=35 and int(age) >= 25:
     print("You are:", age, ",you might find Rap music interesting")
elif int(age) <=25 and int(age) >= 13:
    print("You are:", age, ",you might find R&B music interesting")

else:
    print("Invalid Input")
