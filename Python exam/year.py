year = int(input("Enter your year: "))

age = 2022 - year

if int (year) >= 1922 and int(year) <= 1949:
    print("You are" ,age, "years old; you might find Jazz music interesting")
elif int(year) >=1950 and int(year) <=  1959:
     print("You are" ,age, "years old; you might find Country music interesting")
elif int(year) >=1960 and int(year) <= 1969:
    print("You are" ,age, "years old; you might find Rock music interesting")
elif int(year) >=1970 and int(year) <=  1979:
    print("You are" ,age, "years old; you might find Disco music interesting")
elif int(year) >=1980 and int(year) <=  1989:
     print("You are" ,age, "years old; you might find Pop music interesting")
elif int(year) >=1990 and int(year) <=  1999:
     print("You are" ,age, "years old; you might find Rap music interesting")
elif int(year) >=2000 and int(year) <=  2009:
    print("You are" ,age, "years old; you might find R&B music interesting")

else:
    print("You may listen to any genre of music.")
