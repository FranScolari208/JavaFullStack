Algoritmo sin_titulo
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
	//usuario y muestre por pantalla el promedio de la suma de todos los valores ingresados.
	Definir vector, n, i, suma Como Entero
	Definir promedio Como Real
	
	Escribir "Ingrese el tamaño del vector"
	Leer n
	
	Dimension vector(n)
	suma = 0
	
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		vector(i) = Aleatorio(0, 9)
		suma = suma + vector(i)
	FinPara
	
	promedio = suma / n
	
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		Escribir Sin Saltar "[ " vector(i) " ]"
	FinPara
	Escribir ""
	Escribir "El promedio es: " promedio
FinAlgoritmo
