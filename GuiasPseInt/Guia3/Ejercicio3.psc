Algoritmo esMultiploDeNumero
	//Crea una funci�n EsMultiplo que reciba los dos n�meros pasados por el usuario,
	//validando que el primer numero m�ltiplo del segundo y devuelva verdadero si el
	//primer numero es m�ltiplo del segundo, sino es m�ltiplo que devuelva falso.
	Definir num1, num2 como Enteros
	Definir resultado Como Logico
	
	Escribir "Ingrese dos numeros"
	Leer num1, num2
	
	resultado = esMultiplo(num1, num2)
	Si resultado = Verdadero Entonces
		Escribir num1 " es multiplo de " num2
	SiNo
		Escribir num1 " no es multiplo de " num2
	FinSi
FinAlgoritmo

Funcion esMultiploDe <- esMultiplo(a, b)
	Definir esMultiploDe Como Logico
	
	esMultiploDe = (a mod b = 0) = Verdadero
	FinFuncion
	