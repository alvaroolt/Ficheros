# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Escribe un programa que guarde en un fichero con nombre primos.dat los
números primos que hay entre 1 y 500.

@author: Álvaro Leiva Toledano
@version: 1.0
'''

#Se abre el fichero. Esa "w" significa que se abre en modo escritura.
fichero = open("primos.dat","w")

def compruebaSiPrimo(numero):
    
    #números menores que 1 no son primos.
    if numero <= 1:
        return False
    
    #el número 2 siempre es primo.
    elif numero == 2:
        return True
    else:
        for x in range(2, numero):
            if numero % x == 0:
                return False
        return True

for y in range(501):
    if(compruebaSiPrimo(y) == True):
        fichero.writelines(str(y)+"\n")

#Se cierra el fichero.
fichero.close()
print("El fichero se ha guardado correctamente.")