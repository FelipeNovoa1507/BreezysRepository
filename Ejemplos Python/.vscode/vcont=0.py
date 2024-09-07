vcont=0
vcont2=0
for letter in range (10):
    letter=str(input("Ingrese una letra"))
    if letter =="a"or"e"or"i"or"o"or"u":
        vcont+=letter
    else:
        vcont2+=letter
    print ("las vocales son:", vcont)
    print ("Las consonantes son:", vcont2)