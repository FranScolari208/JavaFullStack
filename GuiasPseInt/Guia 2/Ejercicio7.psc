Algoritmo interrogacionOExclamacion
	//Realizar un programa que pida una frase o palabra y si la frase o palabra es de 4
	//caracteres de largo, el programa le concatenara un signo de exclamación al final, y si no
	//es de 4 caracteres el programa le concatenara un signo de interrogación al final. El
	//programa mostrará después la frase final. Nota: investigar la función Longitud() y
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
