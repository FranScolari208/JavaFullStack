Algoritmo sin_titulo
	//Dada una matriz de orden n * m (donde n y m son valores ingresados por el usuario)
	//realizar un subprograma que llene la matriz de numeros aleatorios. Despues, crearemos
	//otro subprograma que calcule y muestre la suma de los elementos de la matriz. Mostrar
	//la matriz y los resultados por pantalla.
	Definir n, m, matriz, i, j como Enteros
	
	Escribir "Ingrese el tamaño de las filas"
	Leer n
	Escribir "Ingrese el tamaño de las columnas"
	Leer m
	
	Dimension matriz(n, m)
	
	LlenadoMatriz(matriz, n, m)
	sumaMatriz(matriz, n, m)
	
FinAlgoritmo

Subproceso LlenadoMatriz(matriz,n, m)
	Definir i, j como Enteros
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			matriz(i,j) = Aleatorio(0, 9)
		FinPara
	FinPara
FinSubProceso

SubProceso sumaMatriz(matriz, n, m)
	Definir i, j, contador como Enteros
	contador = 0
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			contador = contador + (matriz(i, j))
		FinPara
	FinPara
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Escribir Sin Saltar "(" matriz(i,j) ")"
		FinPara
		Escribir ""
	FinPara
	
	Escribir "El resultado de la suma es: " contador
FinSubProceso
	