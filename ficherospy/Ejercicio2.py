# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Realiza un programa que lea el fichero creado en el ejercicio anterior y que
muestre los números por pantalla.

@author: Álvaro Leiva Toledano
@version: 1.0
'''

#Se abre el fichero. Esa "r" significa que se abre en modo lectura.
fichero = open("primos.dat","r")

#Se muestra por pantalla lo que hay en primos.dat: 
print(fichero.read())

#Se cierra el fichero.
fichero.close()
print("Fichero leído correctamente.")