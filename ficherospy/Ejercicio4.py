# -*- coding: utf-8 -*-
'''
Created on 2 abr. 2019
Realiza un programa que sea capaz de ordenar alfabéticamente las palabras
contenidas en un fichero de texto. El nombre del fichero que contiene las
palabras se debe pasar como argumento en la línea de comandos. El nombre
del fichero resultado debe ser el mismo que el original añadiendo la coletilla
sort, por ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una
línea.

@author: Álvaro Leiva Toledano
version: 1.0
'''

#Se le pide al usuario el nombre del fichero.
nombreFichero = input("Introduzca el nombre del fichero: ")

#Abrimos el archivo en modo lectura. Preguntamos al usuario cómo se llama el fichero.
lecturaFichero = open(nombreFichero+".txt","r")

#Abrimos el archivo en modo escritura (aqui estarán las palabras ordenadas).
escrituraFichero = open(nombreFichero+"_sort.txt", "w")

lista = []

#Este for me ayuda a rellenar el array lista[] con el contenido de las líneas del fichero.
for x in lecturaFichero: #x es la variable auxiliar para recorrer el for, y corresponde al número de línea.
    lista.append(x) 
    
lista.sort() #sort ordena el contenido del array array[].

#Este for rellena el fichero _sort con el contenido del array array[].
for y in lista:
    escrituraFichero.writelines(str(y))
    
lecturaFichero.close()
escrituraFichero.close()

print("Nuevo fichero ordenado creado correctamente.")