Algoritmo sin_titulo
	//Programe una funci�n recursiva que calcule la suma de un arreglo de n�meros enteros.
	Definir n, i, vector, suma Como Entero
	
	suma = 0
	Escribir "Introduzca el tama�o del vector"
	Leer n
	
	Dimension vector(n)
	Escribir "El vector generado es: "
	
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		vector(i) = Aleatorio(0,50)
		suma = suma + vector(i)
		Escribir Sin Saltar "[" vector(i) "] "
		
	FinPara
	Escribir " "
	Escribir "La suma de los elementos del vector es: " suma
	
	
	
FinAlgoritmo
