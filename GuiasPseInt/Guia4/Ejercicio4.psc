Algoritmo sin_titulo
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
	//usuario. A continuación, se deberá crear una función que reciba el vector y devuelva el 
	//valor más grande del vector.
	
	Definir n, vector, i, condicion, posicion Como Entero
	
	Escribir "Ingrese el tamaño del vector"
	Leer n
	
	Dimension vector(n)
	condicion = 0
	posicion = 0
	Para i = 0 Hasta n - 1 Hacer
		Escribir "Ingrese el valor del vector de la posicion: " i
		Leer vector(i)
	FinPara
	
	Para i = 0 Hasta n - 1 Hacer
		
		Si vector(i) > condicion Entonces
			condicion = vector(i)
			posicion = i
		FinSi
		
	FinPara
	
	Escribir "El valor mas grande del vector es " condicion " en la posicion: " posicion
FinAlgoritmo
	