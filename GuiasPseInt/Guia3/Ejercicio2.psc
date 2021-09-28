Algoritmo par_impar
	//Realizar una función que valide si un numero es impar o no. Si es impar la función debe 
	//devolver un verdadero, si no es impar debe devolver falso. Nota: la función no debe 
	//tener mensajes que digan si es par o no, eso debe pasar en el Algoritmo
	Definir num como Entero
	Definir resultado como Logico
	
	Escribir "Ingrese un numero"
	Leer num
	
	resultado = par_o_impar(num)
	
	Si resultado = Verdadero Entonces
		Escribir "El numero que ingreso usted es par"
	SiNo
		Escribir "El numero que ingreso usted es impar"
	FinSi
	
FinAlgoritmo

Funcion validacion <- par_o_impar(a)
	Definir validacion Como Logico
	
	validacion = (a mod 2 = 0) = Verdadero
	
	FinFuncion
	