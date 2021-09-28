Algoritmo sin_titulo
	//Escribir un programa que realice la búsqueda lineal de un número entero ingresado por
	//el usuario en una matriz de 5x5, llena de números aleatorios y devuelva por pantalla las
	//coordenadas donde se encuentra el valor, es decir en que fila y columna se encuentra.
	//En caso de no encontrar el valor dentro de la matriz se debe mostrar un mensaje.
	Definir n, m, i, j, matriz, num como Entero
	
	n = 5
	m = 5
	Dimension matriz(n,m)
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			matriz(i,j) = Aleatorio(0, 9)
		FinPara
	FinPara
	
	Escribir "Ingrese un valor entre 0 y 9 para buscarlo en la matriz"
	Leer num
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Escribir Sin Saltar "(" matriz(i,j) ")"
		FinPara
		Escribir ""
	FinPara

	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Si num = matriz(i, j)
				Escribir "El valor se encuentra en la posicion (" i "," j ")"
			FinSi
		FinPara
	FinPara
	
	
FinAlgoritmo
