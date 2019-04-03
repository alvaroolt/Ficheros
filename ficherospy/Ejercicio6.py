# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Realiza un programa que diga cuántas ocurrencias de una palabra hay en un
fichero. Tanto el nombre del fichero como la palabra se deben pasar como
argumentos en la línea de comandos.

@author: Álvaro Leiva Toledano
'''

#Preguntamos al usuario por el fichero con el que trabajará el programa.
nombreFichero = input("Introduce el nombre del fichero: ")

#Preguntamos al usuario cuál es la palabra que desea que el programa encuentre dentro del fichero.
palabra = input("Palabra a buscar: ")


#Se abre el fichero (en modo lectura)
f = open(nombreFichero+".txt","r")

#Este contador cuenta el número de veces que aparece la palabra.
contador = 0

#Se almacena el contenido del fichero en una cadena de texto.
texto = f.read()

#Se cierra el fichero
f.close()

#palabrasSeparadas almacena cada palabra del fichero (separadas) en una lista.
palabrasSeparadas = texto.split() 

#Este for trata de encontrar coincidencias de la palabra elegida con cada una de la lista. Si encuentra una, aumenta el contador
for x in palabrasSeparadas:
    if x == palabra:
        contador += 1
        
print("La palabra "+str(palabra)+" se encontró "+str(contador)+" veces.")