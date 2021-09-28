Algoritmo sin_titulo
	//Rellenar en un subproceso una matriz cuadrada con números aleatorios salvo en la
	//diagonal principal, la cual debe rellenarse con ceros. Una vez llena la matriz debe
	//generar otro subproceso para imprimir la matriz.
	
	Definir matriz, n Como Entero
	
	Escribir "Ingrese tamaño de la matriz, al ser cuadrada las filas y columnas son iguales"
	Leer n
	
	Dimension matriz(n,n)
	
	RellenoDeMatriz(matriz,n)
	ImpresionDeMatriz(matriz,n)
	
FinAlgoritmo

SubProceso RellenoDeMatriz(matriz,n)
	Definir i, j como Entero
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n - 1) con Paso 1 Hacer
			Si i = j Entonces
				matriz(i,j) = 0
			SiNo
				matriz(i,j) = Aleatorio(1, 9)
			FinSi
		FinPara
	FinPara
FinSubProceso

SubProceso ImpresionDeMatriz(matriz,n)
	Definir i, j como Entero
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n -1) con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	