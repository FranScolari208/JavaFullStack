Algoritmo palabraConA
	//Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
	//es una �A�. Si la primera letra es una �A�, se deber� de imprimir un mensaje por pantalla
	//que diga �CORRECTO�, en caso contrario, se deber� imprimir �INCORRECTO�. Nota:
	//investigar la funci�n Subcadena de Pseint.
	Definir palabra como Cadena
	Definir letra como Caracter
	
	Escribir "Ingrese una frase o palabra"
	Leer palabra
	
	letra = 'a'
	
	Si subcadena(palabra, 0, 0) = letra Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
		
	FinSi
	
FinAlgoritmo
