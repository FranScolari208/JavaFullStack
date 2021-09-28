Algoritmo sin_titulo
	//Realizar una función que calcule la suma de los dígitos de un numero.
	//Ejemplo: 25 = 2 + 5 = 7
	//Nota: Para obtener el último numero de un digito de 2 cifras o más debemos pensar en
	//el resto de una división entre 10. Recordar el uso de la función Mod y Trunc.
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
