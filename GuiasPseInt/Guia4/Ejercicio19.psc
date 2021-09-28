Algoritmo sin_titulo
	//Crear una función que devuelva la diferencia que hay entre el valor más chico de un
	//arreglo y su valor más grande.
	
	Definir i, vector, maximo, minimo, n como Entero
	
	Escribir "Ingrese el tamaño del vector"
	Leer n
	
	Dimension vector(n)
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		vector(i) = Aleatorio(-20, 20)
		Si i = 0 Entonces
			maximo = vector(i)
			minimo = vector(i)
		SiNo
			Si vector(i) > maximo Entonces
				maximo = vector(i)
			SiNo
				Si vector(i) < minimo Entonces
					minimo = vector(i)
				FinSi
			FinSi
		FinSi
	FinPara
	
	Para i = 0 Hasta (n - 1) con Paso 1 Hacer
		Escribir Sin Saltar  "[" vector(i) "]"
	FinPara
	Escribir ""
	
	Escribir "El maximo numero es: " maximo
	Escribir "El minimo numero es: " minimo
	
FinAlgoritmo
