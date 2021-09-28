Algoritmo max_min_promedio
	//Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el
	//programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de
	//todos ellos.
	Definir num, suma, contador, max, min Como Entero
	Definir promedio como Real
	
	num = 1
	contador = 0
	suma = 0
	max = 0
	min = 0
	
	Mientras (num <> 0) Hacer
		
		Escribir "Ingrese un valor"
		Leer num
		contador = contador + 1
		suma = suma + num
		
		Si num > max Entonces
			max = num
		Sino 
			Si num < min Entonces
				min = num
			FinSi
		FinSi
		
	FinMientras
	
	promedio = (suma ) / (contador - 1)
	
	Escribir "El promedio de los numeros ingresados es: " promedio
	Escribir "El maximo de los numeros ingresados es: " max
	Escribir "El minimo de los numeros ingresados es: " min
FinAlgoritmo
