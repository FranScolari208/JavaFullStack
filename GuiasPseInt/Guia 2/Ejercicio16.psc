Algoritmo promedioDeNumeros

	Definir num, suma, contador Como Entero
	Definir promedio como Real
	
	num = 0
	contador = 0
	suma = 0
	
	
	Mientras (num <> -1) Hacer
		Escribir "Ingrese un valor"
		Leer num
		contador = contador + 1
		suma = suma + num
	FinMientras
	
	promedio = (suma + 1) / (contador - 1)
	
	Escribir "El promedio de los numeros ingresados es: " promedio
	
FinAlgoritmo
