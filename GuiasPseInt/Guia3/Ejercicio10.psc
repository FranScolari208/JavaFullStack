Algoritmo sin_titulo
	
	procesoRecursivo()
	
FinAlgoritmo

SubProceso procesoRecursivo()
	Definir num, resultado Como Entero
	Escribir "Ingrese un numero"
	Leer num
	
	resultado = Recursividad(num)
	Escribir "El resultado de sumar los primeros " num " enteros es: " resultado
	
FinSubProceso

Funcion suma <- Recursividad(n)
	Definir suma Como Entero
	
	suma = 0
	Si n = 0 Entonces
		suma = suma
	SiNo 
		Si n = 1
			suma = suma + 1
		SiNo
			suma = n + Recursividad(n-1)
		FinSi
		
	FinSi
FinFuncion

	