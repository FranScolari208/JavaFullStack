Algoritmo palabraDe6
	//Realizar un programa que pida introducir solo frases o palabras de 6 caracteres. Si el
	//usuario ingresa una frase o palabra de 6 caracteres se deber� de imprimir un mensaje
	//por pantalla que diga �CORRECTO�, en caso contrario, se deber� imprimir
	//�INCORRECTO�. Nota: investigar la funci�n Longitud() de Pseint.
	Definir palabra como Cadena
	
	Escribir "Introduzca una palabra de 6 letras"
	Leer palabra
	
	Si longitud(palabra) = 6 Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
		
	FinSi
	
FinAlgoritmo
