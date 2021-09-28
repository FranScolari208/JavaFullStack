Algoritmo sin_titulo
	//Crear una matriz de orden n * m (donde n y m son valores ingresados por el usuario),
	//llenarla con números aleatorios entre 1 y 100 y mostrar su traspuesta. 
	Definir n, m, matriz Como Entero
	
	Escribir "Ingrese el tamaño de la fila"
	Leer n
	
	Escribir "Ingrese el tamaño de la columna"
	Leer m
	
	Dimension matriz(n, m)
	
	llenadoDeMatriz(matriz, n, m)
	Escribir "La matriz aleatoria es: "
	muestraDeMatriz(matriz, n, m)
	matrizTraspuesta(matriz, n, m)
	Escribir "La matriz traspuesta es: "
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

SubProceso matrizTraspuesta(matriz, n, m)
	Definir i, j, matrizAux como Entero
	DImension matrizAux(n,m)
	
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			matrizAux(i,j) = matriz(i,j)
		FinPara
	FinPara
	
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
		
		matriz(j,i) = matrizAux(i,j)
			
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