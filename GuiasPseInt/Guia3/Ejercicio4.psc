Algoritmo contador_De_Letras
	//Realizar un programa que pida al usuario una frase y una letra a buscar en esa frase. La
	//función debe devolver la cantidad de veces que encontró la letra. Nota: recordar el uso
	//de la función Subcadena().
	Definir palabra como Cadena
	Definir letra Como Caracter
	Definir resultado Como Entero
	
	Escribir "Ingrese una palabra o frase"
	Leer palabra
	Escribir "Ingrese una letra para evaluar"
	Leer letra
	
	resultado = contadorLetra(palabra, letra)
	
	Escribir "La cantidad de veces que se repite la letra " letra " en " palabra " es: " resultado
	
FinAlgoritmo

Funcion contador <- contadorLetra(palabra, letra)
	Definir contador, largoPalabra, n Como Entero
	Definir validacion como Logico

	largoPalabra = longitud(palabra)
	contador = 0
	n = 0
	
	Mientras largoPalabra <> 0 Hacer
		
		Si (letra = subcadena(palabra, n, n)) Entonces
			contador = contador + 1
		FinSi
		n = n + 1
		largoPalabra = largoPalabra - 1
	FinMientras
	
	FinFuncion
	