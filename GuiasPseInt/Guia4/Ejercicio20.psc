Algoritmo sin_titulo
	
	//Crear un programa que ordene un vector lleno de números enteros aleatorios, de menor
	//a mayor
	Definir n, vector Como Entero
	
	Escribir "Ingrese tamaño del vector"
	Leer n
	
	Dimension vector(n)
	
	vectorAleatorio(vector, n)
	vectorOrdenado(vector,n)

	
FinAlgoritmo

SubProceso vectorAleatorio(vector, n)
	
	Definir i como Entero
	
	Para i = 0 hasta (n - 1) con paso 1 Hacer
		vector(i) = Aleatorio(0, 20)
	FinPara
	
	Escribir "El vector aleatorio es: "
	Para i = 0 hasta (n - 1) con paso 1 Hacer
		Escribir Sin Saltar "[" vector(i) "] "
	FinPara
	Escribir ""
FinSubProceso

SubProceso vectorOrdenado(vector, n)
	
	Definir i, j, temp como Entero
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Para j = 0 Hasta (n - 2) con Paso 1 Hacer
			Si vector(j) > vector(j + 1) Entonces
				temp = vector(j)
				vector(j) = vector(j + 1)
				vector(j + 1) = temp
			FinSi
		FinPara
	FinPara
	
	Escribir "El vector ordenado es: "
	Para i = 0 Hasta (n - 1) Hacer
		Escribir SinSaltar "[" vector(i) "] "
	FinPara
	Escribir ""
	
FinSubProceso

