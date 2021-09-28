Algoritmo sin_titulo
	//Realizar un programa que pida una frase y el programa deberá mostrar la frase con un
    //espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el
	//funcionamiento de la función Subcadena().
	Definir palabra como Cadena
	Definir largo, inicial, final, n, contador como Entero
	Definir letra Como Caracter
	
	Escribir "Ingrese una palabra o frase"
	Leer palabra
	
	largo = longitud(palabra)
	inicial = 0
	final = 0
	contador = 0
	
	Para n <- 0 hasta largo con paso 1 Hacer
		
		letra = subcadena(palabra, inicial, final)
		Escribir sin Saltar letra , " "
		inicial = inicial + 1
		final = final + 1
		contador = contador + n
		
	FinPara
	Escribir " "
FinAlgoritmo
