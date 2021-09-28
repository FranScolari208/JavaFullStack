Algoritmo sin_titulo
	//Disponemos de un vector unidimensional de 20 elementos de tipo car�cter. Se pide
	//desarrollar un programa que:
	//a. Pida una frase al usuario y luego ingrese la frase dentro del arreglo letra por
	//letra. Ayuda: utilizar la funci�n Subcadena de PSeInt.
	//b. Una vez completado lo anterior, pedirle al usuario un car�cter cualquiera y una
	//posici�n dentro del arreglo, y el programa debe intentar ingresar el car�cter
	//en la posici�n indicada, si es que hay lugar (es decir la posici�n est� vac�a o
	//es un espacio en blanco). De ser posible debe mostrar el vector con la frase y
	//el car�cter ingresado, de lo contrario debe darle un mensaje al usuario de que
	//esa posici�n estaba ocupada.
	Definir vector, frase como Cadena
	Definir letra Como Caracter
	Definir i, posicion como Entero
	
	Dimension vector(20)
	
	Escribir "Escriba una frase de como maximo 20 caracteres"
	Leer frase
	
	Si longitud(frase) > 20 Entonces
		Escribir "La frase ingresada supera la cantidad maxima de caracteres"
	SiNo
		Para i = 0 Hasta (longitud(frase) - 1) Hacer
			vector(i) = Subcadena(frase, i, i)
		FinPara
		
		Escribir "Ingrese un caracter"
		Leer letra
		Escribir "Ingrese una posicion dentro del vector"
		Leer posicion
		
		Si vector(posicion) = " " Entonces
			vector(posicion) = letra
		SiNo
			Escribir "La posicion que ingreso ya esta ocupada"
		FinSi
		
		Para i = 0 Hasta (longitud(frase) - 1) con Paso 1 Hacer
			Escribir Sin Saltar  vector(i) " "
		FinPara
		Escribir ""
	FinSi
	
	
FinAlgoritmo
