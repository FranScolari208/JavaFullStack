Algoritmo sin_titulo
	
	Definir seleccion, muestra_Vector Como Caracter
	Definir vectorA, vectorB, vectorC, vectorD, vectorE, n, i Como Entero
	Definir vectorA_Relleno, vectorB_Relleno, vectorC_Relleno Como Logico
	
	seleccion = ''
	vectorA_Relleno = Falso
	vectorB_Relleno = Falso
	vectorC_Relleno = Falso
	
	Escribir "Ingrese el tamaño del vector"
	Leer n
	
	Dimension vectorA(n), vectorB(n), vectorC(n)

	Mientras seleccion <> 'f' Hacer
		Escribir " Seleccione una Opcion :"
		Escribir "a) Llenar Vector A."
		Escribir "b) Llenar Vector B."
		Escribir "c) Llenar Vector C con la suma de los vectores A y B"
		Escribir "d) Llenar Vector C con la resta de los vectores B y A"
		Escribir "e) Decidir qué vector quiere mostrar:"
		Escribir "f) Salir."
		Leer seleccion
		

		
		Segun seleccion Hacer
			'a':
				Para i = 0 Hasta (n - 1) con Paso 1 Hacer
					vectorA(i) = Aleatorio(-100, 100)
				FinPara
				vectorA_Relleno = Verdadero
			'b':
				Para i = 0 Hasta (n - 1) con Paso 1 Hacer
					vectorB(i) = Aleatorio(-100, 100)
				FinPara
				vectorB_Relleno = Verdadero
			'c': 
				Si ((vectorA_Relleno == Falso) y (vectorB_Relleno == Falso)) Entonces
					Escribir "Para rellenar el vector C primero debe rellenar el vector de la opcion A y el vector de la opcion B"
				SiNo
					Para i = 0 Hasta (n - 1) con Paso 1 Hacer
						vectorC(i) = vectorA(i) + vectorB(i)
					FinPara
					vectorC_Relleno = Verdadero
				FinSi
				
			'd': 
				Si ((vectorA_Relleno == Falso) y (vectorB_Relleno == Falso)) Entonces
					Escribir "Para rellenar el vector C primero debe rellenar el vector de la opcion A y el vector de la opcion B"
				SiNo
					Para i = 0 Hasta (n - 1) con Paso 1 Hacer
						vectorC(i) = vectorB(i) - vectorA(i)
					FinPara
					vectorC_Relleno = Verdadero
				FinSi
				
			'e': 
				Escribir "Indique que vector quiere mostrar"
				Leer muestra_Vector
				
				Segun muestra_Vector Hacer
					'a':
						Si vectorA_Relleno == Falso Entonces
							Escribir "Para mostrar el vector A primero debe rellenarlo"
						SiNo
							Para i = 0 Hasta (n - 1) con Paso 1 Hacer
								Escribir Sin Saltar "[ " vectorA(i) " ]"
							FinPara
							Escribir ""
						FinSi
					'b':
						Si vectorB_Relleno == Falso Entonces
							Escribir "Para mostrar el vector B primero debe rellenarlo"
						SiNo
							Para i = 0 Hasta (n - 1) con Paso 1 Hacer
								Escribir Sin Saltar "[ " vectorB(i) " ]"
							FinPara
							Escribir ""
						FinSi
					'c':
						Si vectorC_Relleno == Falso Entonces
							Escribir "Para mostrar el vector C primero debe rellenarlo"
						SiNo
							Para i = 0 Hasta (n - 1) con Paso 1 Hacer
								Escribir Sin Saltar "[ " vectorC(i) " ]"
							FinPara
							Escribir ""
						FinSi
				FinSegun
			De Otro Modo:
				Escribir "La opcion ingresada es incorrecta"
		FinSegun
		
	FinMientras
FinAlgoritmo





