Algoritmo sin_titulo
	//Una matriz mágica es una matriz cuadrada (tiene igual número de filas que de columnas)
	//que tiene como propiedad especial que la suma de las filas, las columnas y las
	//diagonales es igual. Por ejemplo:
	//			2 7 6
	//			9 5 1
	//			4 3 8
	//En la matriz de ejemplo las sumas son siempre 15. Considere el problema de construir
	//un algoritmo que compruebe si una matriz de datos enteros es mágica o no, y en caso
	//de que sea mágica escribir la suma. Además, el programa deberá comprobar que los
	//números introducidos son correctos, es decir, están entre el 1 y el 9. El usuario ingresa el
	//tamaño de la matriz que no debe superar orden igual a 10.
	Definir n, matriz, i, j, num, contador, validacion, suma, verticales, diagonal, k, columna, h como Enteros
	Definir esMagica como Logico
	
	Escribir "Ingrese el tamaño de una matriz cuadrada"
	Leer n
	
	Dimension matriz(n, n)
	
	validacion = 0
	contador = 0
	verticales = 0
	diagonal = 0
	k = 0
	columna = 0
	//---------------------------Relleno de matriz (comparando rangos)------------------------------------
	Para i = 0 Hasta (n - 1)  Hacer
		Para j = 0 Hasta (n - 1)  Hacer
			Escribir "Ingrese un valor para la posicion (" i ", " j ")"
			Leer num
			Si num >= 1 y num <= 9 Entonces
				matriz(i,j) = num
			SiNo
				Mientras num < 1 o num > 9 Hacer
					Escribir "Ingrese un valor para la posicion (" i ", " j ") que este entre 1 y 9"
					Leer num
				FinMientras
				matriz(i,j) = num
			FinSi
		FinPara
	FinPara
	
	//---------------------Suma de filas y validacion de q sean iguales--------------------
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n -1) con Paso 1 Hacer
			
			contador = contador + matriz(i,j)
		FinPara
		
		Si i = 0
			suma = contador
			validacion = validacion + 1
		SiNo
			Si suma = contador Entonces
				validacion = validacion + 1
			FinSi
			
		FinSi
		contador = 0
	FinPara
	Si validacion = n  Entonces
		verticales = verticales + 1
	FinSi
	
	//-----------------------Suma de diagonal a derecha y validacion-------------------------
	contador = 0
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n -1) con Paso 1 Hacer
			
			Si i = j Entonces
				contador = contador + matriz(i,j)
			FinSi
		FinPara
		
	FinPara
	
	Si suma = contador Entonces
		diagonal = diagonal + 1
	FinSi
	
	//--------------------Suma de diagonal a izquierda y validacion --------------------------
	contador = 0
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n -1) con Paso 1 Hacer
			
			Si (i + j) = (n - 1) Entonces
				contador = contador + matriz(i,j)
			FinSi
		FinPara
		
	FinPara
	
	Si suma = contador Entonces
		diagonal = diagonal + 1
	FinSi
	
	//-------------------Compobacion de si ambas diagonales cumplen---------------------------
	Si diagonal = 2 Entonces
		verticales = verticales + 1
	FinSi
	
	//---------------------Suma de columnas y validacion de q sean iguales-------------------
	contador = 0
	Para h = 0 Hasta (n - 1) con Paso 1 Hacer
		Para i = 0 Hasta (n - 1) con Paso 1 Hacer             // Recorro Filas
			Para j = 0 Hasta (n -1) con Paso 1 Hacer		  // Recorro columnas
				Si j = k Entonces                             // Comparo suma de una misma columna 
					contador = contador + matriz(i,j)
				FinSi
				
			FinPara
			
		FinPara
		
		Si suma = contador Entonces
			columna = columna + 1							// Veo si la suma de la columna es igual a la suma de las filas
		FinSi
		k = k + 1										//Paso a la columna que sigue
		contador = 0										// reinicio contador
	FinPara
	
	
	Si columna = n Entonces								//Veo si todas las columnas cumplen
		verticales = verticales + 1
	FinSi
	//-------------------------------------Muestra de matriz----------------------------------
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n -1) con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "]"
		FinPara
		Escribir ""
	FinPara
	
	//----------------Validacion de que filas columnas y diagonales den lo mismo---------------
	Si verticales = 3 Entonces					     	// Veo si columnas, diagonales y filas cumplen
		esMagica = Verdadero
	SiNo
		esMagica = Falso
	FinSi
	
	//------------------------------Muestra de resultados--------------------------------------
	Si esMagica = Verdadero Entonces
		Escribir "La matriz es magica"
		Escribir "La suma de la matriz magica es: " suma
	SiNo
		Escribir "La matriz no es magica"
	FinSi
	
FinAlgoritmo
