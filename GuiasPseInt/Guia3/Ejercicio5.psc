Algoritmo sin_titulo
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el 
	//numero es primo o no. Un n�mero es primo cuando es divisible s�lo por 1 y por s� 
	//mismo, por ejemplo: 2, 3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD.
	Definir num Como Entero
	Definir resultado Como Logico
	Escribir "Ingrese un numero Entero"
	Leer num
	
	resultado = esPrimo(num)
	
	Si resultado = Verdadero Entonces
		Escribir "El numero " num " es Primo"
	SiNo
		Escribir "El numero " num " no es Primo"
	FinSi
	
FinAlgoritmo

Funcion primoONo = esPrimo(n)
	Definir PrimoONo Como Logico
	Definir contador, i como Entero
	
	contador = 0
	
	Para i <- 1 Hasta n Hacer
		Si n mod i = 0 Entonces
			contador = contador + 1
		FinSi
		Si contador = 2 Entonces
			primoONo = Verdadero
		SiNo
			primoONo = Falso
		FinSi
	FinPara
	FinFuncion
	