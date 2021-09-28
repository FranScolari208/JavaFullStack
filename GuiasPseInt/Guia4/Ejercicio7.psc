Algoritmo sin_titulo
	//Crear un subproceso que rellene dos arreglos de tama�o n, con n�meros aleatorios.
	//Despu�s, hacer una funci�n que reciba los dos arreglos y diga si todos sus valores son
	//iguales o no. La funci�n debe devolver el resultado de est� validaci�n, para mostrar el
	//mensaje en el algoritmo. Nota: recordar el uso de las variables de tipo l�gico.
	Definir n, vector1, vector2, i Como Entero
	
	Escribir "Ingrese el tama�o de los vectores"
	Leer n
	
	Dimension vector1(n)
	Dimension vector2(n)
	
	RellenarVectores(vector1, n)
	RellenarVectores(vector2, n)
	
	Si sonIguales(vector1, vector2, n) = Falso Entonces
		Escribir "Los vectores no son iguales"
	SiNo
		Escribir "Los vectores son iguales"
		
	FinSi
	
FinAlgoritmo

SubProceso RellenarVectores(vector Por Referencia, n )
	Definir i como Entero
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		vector(i) = Aleatorio(-100,100)
	FinPara
	
	Escribir "El vector es:"
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Escribir Sin Saltar "[ " vector(i) " ]"
	FinPara
	Escribir ""
	FinSubProceso
	
	Funcion iguales = sonIguales(vector1, vector2, n)
		Definir i, contador Como Entero
		Definir iguales como Logico
		
		contador = 0
		Para i = 0 Hasta (n - 1) Hacer
			Si vector1(i) == vector2(i) Entonces
				contador = contador + 1
			FinSi
		FinPara
		Si contador = n Entonces
			iguales = Verdadero
		SiNo
			iguales = Falso
		FinSi
		
		FinFuncion