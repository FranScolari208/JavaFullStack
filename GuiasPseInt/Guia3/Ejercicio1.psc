Algoritmo suma_guia3
	//Realizar una función que calcule la suma de dos números. En el algoritmo principal le 
	//pediremos al usuario los dos números para pasárselos a la función. Después la función 
	//calculará la suma y lo devolverá para imprimirlo en el algoritmo
	
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
