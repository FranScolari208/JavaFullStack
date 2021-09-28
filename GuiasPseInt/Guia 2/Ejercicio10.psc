Algoritmo primeraYUltimaLetra
	//Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la
	//primera letra de la frase es igual a la ultima letra de la frase. Se deberá de imprimir un
	//mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
	Definir palabra como Cadena
	Definir largo, anterior como Entero
	Definir letra Como Caracter
	
	Escribir "Introduzca una palabra o frase"
	Leer palabra
	
	largo = longitud(palabra)
	anterior = largo - 1
	letra = subcadena(palabra, 0, 0)
	
	Si  subcadena(palabra, anterior, anterior) = letra Entonces
		Escribir "Correcto"
	SiNo 
		Escribir "Incorrecto"
	FinSi
	
FinAlgoritmo
