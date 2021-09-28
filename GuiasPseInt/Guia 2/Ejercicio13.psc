Algoritmo sin_titulo
	// Escriba un programa para obtener el grado de eficiencia de un operario de una f�brica
	//de tornillos, de acuerdo a las siguientes dos condiciones que se le imponen para un per�odo de prueba:
	// *Producir menos de 200 tornillos defectuosos.
	// *Producir m�s de 10000 tornillos sin defectos.
	// El grado de eficiencia se determina de la siguiente manera:
	// *Si no cumple ninguna de las condiciones, grado 5.
	// *Si s�lo cumple la primera condici�n, grado 6.
	// *Si s�lo cumple la segunda condici�n, grado 7.
	// *Si cumple las dos condiciones, grado 8
	// Nota: para trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio. No hacer todos al mismo tiempo y despu�s probar.
	
	Definir defectuosos, noDefectuosos como Enteros
	Definir condicion1, condicion2 Como Logico
	
	Escribir "Ingrese la cantidad de tornillos defectuosos que el operario produzco:"
	Leer defectuosos
	Escribir "Ingrese la cantidad de tornillos NO defectuosos que el operario produzco:"
	Leer noDefectuosos
	
	condicion1 = defectuosos < 200
	condicion2 = noDefectuosos > 1000
	
	Si condicion1 = Verdadero y condicion2 = Verdadero Entonces
		Escribir "El operario es de grado 8"
	SiNo 
		Si condicion1 = Falso y condicion2 = Verdadero Entonces
			Escribir "El operario es de grado 7"
		SiNo
			Si condicion1 = Verdadero y condicion2 = Falso Entonces
				Escribir "El operario es de grado 6"
			SiNo
				Escribir "El operario es de grado 5"
			FinSi
		FinSi
	FinSi
FinAlgoritmo