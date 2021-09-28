Algoritmo numeroMayorA100
	//Realizar un programa que pida un número al usuario. Si el número es mayor que 100 se
	//deberá de imprimir en pantalla “Es Mayor”, y en caso contrario se deberá imprimir “Es Menor”.
	Definir num Como Entero
	
	Escribir "Escriba un numero"
	Leer num
	
	Si num > 100 entonces 
		Escribir "El numero que ingreso es mayor que 100"
	SiNo
		Si num = 100
			Escribir "El numero que ingreso es igual a 100"
		SiNo
			Escribir "El numero que ingreso es menor a 100"
		FinSi
	FinSi
	
FinAlgoritmo
