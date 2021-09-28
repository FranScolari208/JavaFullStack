Algoritmo sin_titulo
	//Realizar un programa que rellene un vector con 5 valores ingresados por el usuario y los 
	//muestre por pantalla.
	Definir vector, n, i como Entero
	
	Escribir "Tamaño del vector"
	Leer n
	
	Dimension vector(n)
	
	Para i = 0 hasta n - 1 Hacer
		
		Escribir "Ingrese el valor de la posicion: " i " para el primer vector"
		Leer vector(i)
		
	FinPara
	
	Para i = 0 Hasta n - 1 Hacer
	
		Escribir Sin Saltar " " vector(i) " "
	
	FinPara
	
	Escribir " "
	
FinAlgoritmo
