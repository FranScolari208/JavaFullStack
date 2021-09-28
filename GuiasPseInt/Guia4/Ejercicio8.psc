Algoritmo sin_titulo
	//Realizar un programa que rellene una matriz de 3x3 con 9 valores ingresados por el
	//usuario y los muestre por pantalla.
	Definir n, m, matriz, i, j Como Entero
	
	Escribir "Ingrese tamaño de filas"
	Leer n
	Escribir "Ingrese tamaño de columnas"
	Leer m
	
	Dimension matriz(n,m)
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Escribir "Ingrese valor para la posicion (" i "," j ") de la matriz"
			Leer matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Escribir Sin Saltar "(" matriz(i,j) ")"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
