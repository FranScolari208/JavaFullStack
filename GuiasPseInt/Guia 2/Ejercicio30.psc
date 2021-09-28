Algoritmo numero_3_digitos
	//Hacer un algoritmo que lea un número por el teclado y determine si tiene tres dígitos.
	Definir num, contador, condicion Como Entero
	
	Escribir "Ingrese un numero"
	Leer num
	
	contador = 0
	
	Mientras num <> 0 Hacer
		num = trunc( num / 10 )
		contador = contador + 1
	FinMientras
	
	Si contador = 3 Entonces
		Escribir "El numero que ingreso tiene 3 digitos"
	SiNo
		Escribir "El numero que ingreso no tiene 3 digitos"
	FinSi
FinAlgoritmo
