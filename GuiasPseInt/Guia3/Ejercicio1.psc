Algoritmo suma_guia3
	//Realizar una funci�n que calcule la suma de dos n�meros. En el algoritmo principal le 
	//pediremos al usuario los dos n�meros para pas�rselos a la funci�n. Despu�s la funci�n 
	//calcular� la suma y lo devolver� para imprimirlo en el algoritmo
	
	Definir num1, num2, resultado  como Entero
	
	Escribir "Ingrese dos numeros"
	Leer num1 num2
	
	resultado = sumaNumeros(num1, num2)
	
	Escribir "El resultado de sumar " num1 " y " num2 " es: " resultado
	Escribir " "
	
FinAlgoritmo

Funcion suma <- sumaNumeros(a, b)
	Definir suma Como Entero
	suma = a + b
FinFuncion
