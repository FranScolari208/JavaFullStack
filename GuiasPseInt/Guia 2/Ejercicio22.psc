Algoritmo sin_titulo
	//Realizar un programa que lea un n�mero entero (tama�o del lado) y a partir de �l cree
	//un cuadrado de asteriscos de ese tama�o. Los asteriscos s�lo se ver�n en el borde del
	//cuadrado, no en el interior. Por ejemplo, si se ingresa el n�mero 4 se debe mostrar:
	//	* * * *
	//	*     *
	//	*     *
	//	* * * *
	//Nota: Recordar el uso del escribir sin saltar en Pseint.
	Definir lado, a, b como Entero
	
	Escribir "Introduzca el tama�o del lado de su cuadrado: "
	Leer lado
	
	Para a <- 1 Hasta lado con Paso 1 Hacer
		Para b <- 1 Hasta  lado con Paso 1 Hacer
			Si a > 1 y a < lado y b > 1 y b < lado Entonces
				Escribir " " Sin Saltar
			SiNo
				Escribir "*" Sin Saltar
			FinSi
		FinPara
		
		Escribir " "
		
	FinPara
	
	
	
	
FinAlgoritmo
