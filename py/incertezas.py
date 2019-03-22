#incerteza da posicao = 1,7 mm ou 0.002 m
#incerteza do voltimetro é no excel do moodle
print("1 - on\n0 - off\n")
print("digite ddp, depois Y (em metros) depois a incerteza da ddp\n")
flag = 1
while flag != 0:
    V = float(input())
    D = float(input())
    uV = float(input())
    uD = 0.002
    E = V/D
    uE = (((uV**2)*((1/D)**2) + ((uD**2)*((-V)/(D**2))))**(1/2))

    print("E = %.4f " %E + "+ %.4f" %uE)
    print("on ou off?")
    flag = int(input())
