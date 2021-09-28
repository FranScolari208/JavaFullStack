Algoritmo sin_titulo
	//Realizar un procedimiento que permita intercambiar el valor de dos variables de tipo
	//entero. La variable A, debe terminar con el valor de la variable B.
	
	Definir num1, num2 Como Entero
	Escribir "Ingrese un numero entero"
	Leer num1
	Escribir "Ingrese otro numero entero"
	Leer num2
	
	intercambioDeValores(num1, num2)
	
FinAlgoritmo

SubProceso intercambioDeValores(num1 por Valor, num2 por Valor)
	Definir auxiliar como Entero
	auxiliar = num1
	num1 = num2
	num2 = auxiliar 
	
	Escribir "Numero 1 = " num1
	Escribir "Numero 2 = " num2
	
	
FinSubProceso
	