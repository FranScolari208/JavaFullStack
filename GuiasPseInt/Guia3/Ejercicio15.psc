Algoritmo sin_titulo
	//Realizar una funci�n que calcule la suma de los d�gitos de un numero.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el �ltimo numero de un digito de 2 cifras o m�s debemos pensar en
	//el resto de una divisi�n entre 10. Recordar el uso de la funci�n Mod y Trunc.
	Definir num, resultado Como Entero
	
	Escribir "Ingrese un numero para sumar sus digitos"
	Leer num
	
	resultado = sumaDeDigitos(num)
	Escribir resultado
FinAlgoritmo

Funcion suma <- sumaDeDigitos(num)
	Definir total, suma, resto como Enteros
	Definir division como Reales
	
	total = num
	suma = 0
	division = 0
	resto = 0
	
	Si total >= 10 Entonces
		Mientras total > 0 Hacer
			
			division = (total / 10)
			resto = (total mod 10)
			total = trunc(division)
			suma = suma + resto
		FinMientras
	SiNo
		suma = total
		
	FinSi
		
	
FinFuncion
