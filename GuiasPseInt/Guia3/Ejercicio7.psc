Algoritmo sin_titulo
	//Crear una procedimiento que calcule la temperatura media de un d�a a partir de la
	//temperatura m�xima y m�nima. Crear un programa principal, que utilizando un
	//procedimiento, vaya pidiendo la temperatura m�xima y m�nima de n d�as y vaya
	//mostrando la media de cada d�a. El programa pedir� el n�mero de d�as que se van a
	//introducir.
	
	Definir dias Como Entero
	
	Escribir "Ingrese la cantidad de dias"
	Leer dias
	
	pedirTemperaturasYCalcularlas(dias)
	
FinAlgoritmo

SubProceso pedirTemperaturasYCalcularlas(dias Por Valor)
	Definir tempMax, tempMin, i, promedio Como Real
	
	Para i <- 1 Hasta dias Hacer
		promedio= 0
		Escribir "Ingrese la temperatura maxima del dia: " i
		Leer tempMax
		Escribir "Ingrese la temperatura minima del dia: " i
		Leer tempMin
		
		promedio = (tempMax + tempMin) / 2
		
		Escribir "La temperatura media del dia " i " es: " promedio
		Escribir " "
	FinPara
FinSubProceso
	