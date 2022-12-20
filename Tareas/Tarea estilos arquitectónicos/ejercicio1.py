import math
print("Ingrese dos numeros:")

#input1 = input('num1: ')
#input2 = input('num2: ')
#cn=m!/ n!*(m-n)!
#m

#resultado=numero_conbinacion(input1,input2)

def numero_conbinacion(input1,input2):
    if(input1 > input2):
        return 0
    else:
        comb=math.factorial(input1)/math.factorial(input2)*math.factorial(input1-input2)
        return comb
    
    
print(numero_conbinacion(1,2))