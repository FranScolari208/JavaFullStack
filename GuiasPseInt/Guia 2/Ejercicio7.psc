Algoritmo interrogacionOExclamacion
	//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//caracteres de largo, el programa le concatenara un signo de exclamaci�n al final, y si no
	//es de 4 caracteres el programa le concatenara un signo de interrogaci�n al final. El
	//programa mostrar� despu�s la frase final. Nota: investigar la funci�n Longitud() y
	//Concatenar() de Pseint.
	Definir palabra, concatenarInterrogacion, concatenarExclamacion como Cadena
	Definir interrogacion, exclamacion Como Caracter
	
	Escribir "Introduzca una palabra"
	Leer palabra
	
	interrogacion = '?'
	concatenarInterrogacion = Concatenar(palabra , interrogacion)
	exclamacion = '!'
	concatenarExclamacion = Concatenar(palabra , exclamacion)
	
	Si longitud(palabra) = 4 Entonces
		Escribir concatenarExclamacion
	SiNo
		Escribir concatenarInterrogacion
		
	FinSi
	
FinAlgoritmo
