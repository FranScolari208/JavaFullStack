Algoritmo sin_titulo
	//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
	//solicite números al usuario hasta que la suma de los números introducidos supere el
	//límite inicial.
	Definir limite, suma, num Como Entero
	
	Escribir "Ingresar un valor limite positivo"
	Leer limite
	
	suma = 0
	Si limite > 0 Entonces
		Mientras (suma < limite) Hacer
			Escribir "Ingrese un valor"
			Leer num
			suma = suma + num
		FinMientras
	SiNo
		Escribir "El codigo que ingreso no es positivo"
	FinSi
	
	
FinAlgoritmo
