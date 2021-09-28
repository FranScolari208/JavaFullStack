Algoritmo dividiendoRestas
	
	Definir num1, num2 como Enteros
	
	Escribir "Ingrese un numero entero"
	Leer num1
	Escribir "Ingrese otro numero entero"
	Leer num2
	
	divisionPorRestas(num1, num2)
	
FinAlgoritmo

SubProceso divisionPorRestas(num1 por Valor, num2 por Valor)
	Definir resta, contador como Entero
	resta = num1
	contador = 0
	
	Mientras resta >= num2 Hacer
		resta = resta - num2
		contador = contador + 1
	FinMientras
	
	Escribir "El resultado de la division del primer numero por el segundo es: " contador " y el resto de la division es: " resta
	
FinSubProceso
	

