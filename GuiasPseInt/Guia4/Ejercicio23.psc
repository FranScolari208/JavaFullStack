Algoritmo sin_titulo
	//Realizar un programa que rellene de números aleatorios una matriz a través de un
	//subprograma y generar otro subprograma que muestre por pantalla la matriz final.
	Definir n, m, matriz Como Entero
	
	Escribir "Ingrese el tamaño de la fila"
	Leer n
	
	Escribir "Ingrese el tamaño de la columna"
	Leer m
	
	Dimension matriz(n, m)
	
	llenadoDeMatriz(matriz, n, m)
	muestraDeMatriz(matriz, n, m)
FinAlgoritmo

SubProceso llenadoDeMatriz(matriz, n, m)
	
	Definir i, j como Entero
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			matriz(i,j) = Aleatorio(0,9)
		FinPara
	FinPara
FinSubProceso

SubProceso muestraDeMatriz(matriz, n, m)
	Definir i, j como Entero
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "] "
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso
	