Algoritmo sin_titulo
	//Realizar una función que calcule y retorne la suma de todos los divisores del número n
	//distintos de n. El valor de n debe ser ingresado por el usuario.
	Definir num, resultado Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	resultado = sumaDivisores(num)
	Escribir "El resultado de sumar todos los divisores del numero " num " es " resultado
	
FinAlgoritmo

Funcion suma <- sumaDivisores(num)
	Definir anterior, suma Como Entero
	anterior = num
	suma = 0
	Mientras anterior <> 0 Hacer
		Si (num mod anterior = 0 ) Entonces
			suma = suma + anterior
		FinSi
		anterior = anterior - 1

	FinMientras
	
FinFuncion
	