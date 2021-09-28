Algoritmo sin_titulo
	//Realizar un programa que lea 10 números reales por teclado, los almacene en un arreglo 
	//y muestre por pantalla la suma, resta y multiplicación de todos los números ingresados
	//al arreglo.
	Definir vector, n, i como Entero
	Definir suma, resta, multiplicacion como Entero
	
	suma = 0
	resta = 0
	multiplicacion = 1
	Escribir "Tamaño del vector"
	Leer n
	
	Dimension vector(n)
	
	Para i = 0 hasta n - 1 Hacer
		
		Escribir "Ingrese el valor de la posicion: " i " para el primer vector"
		Leer vector(i)
		
	FinPara
	
	Escribir "Vector: "
	Para i = 0 Hasta n - 1 Hacer
		
		Escribir Sin Saltar "[ " vector(i) " ]"
		
	FinPara
	
	Escribir " "
	
	Escribir "Suma de elementos del vector: "
	
	Para i = 0 Hasta n - 1 Hacer
		
		suma = suma + vector(i)
		
	FinPara
	
	Escribir suma
	
	Escribir "Resta de elementos del vector:"
	
	Para i = 0 Hasta n - 1 Hacer
		
		Si i = 0 Entonces
			resta = vector(i)
		SiNo
			resta = resta - vector(i) 
		FinSi
		
	FinPara
	
	Escribir resta
	
	Escribir "Multiplicacion de elementos del vector"
	
	Para i = 0 Hasta n - 1 Hacer
		
		multiplicacion = multiplicacion * vector(i)
		
	FinPara
	
	Escribir multiplicacion
	
FinAlgoritmo
