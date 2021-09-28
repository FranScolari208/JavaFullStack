Algoritmo sin_titulo
	//Tomando en cuenta el ejercicio 6, mejore el mecanismo de inserci�n del car�cter,
	//facilitando un potencial reordenamiento del vector. Digamos que se pide ingresar el
	//car�cter en la posici�n X y la misma est� ocupada, entonces de existir un espacio en
	//cualquier posici�n X-n o X+n, desplazar los caracteres hacia la izq o hacia la derecha para
	//poder ingresar el car�cter en cuesti�n en el lugar deseado. El procedimiento de
	//reordenamiento debe ubicar el espacio m�s cercano.
	Definir vector, frase como Cadena
	Definir letra Como Caracter
	Definir i, posicion como Entero
	
	Dimension vector(21)
	
	Escribir "Escriba una frase de como maximo 20 caracteres"
	Leer frase
	
	Si longitud(frase) > 20 Entonces
		Escribir "La frase ingresada supera la cantidad maxima de caracteres"
	SiNo
		Para i = 0 Hasta 20 con paso 1 Hacer
			vector(i) = Subcadena(frase, i, i)
		FinPara

		Escribir "Ingrese un caracter"
		Leer letra
		Escribir "Ingrese una posicion dentro del vector"
		Leer posicion
		
		Si vector(posicion) = " " Entonces
			vector(posicion) = letra
		SiNo
			Para i = (posicion) Hasta 19 con Paso 1 Hacer
				vector(i + 1) = Subcadena(frase, i, i)
			FinPara
			vector(posicion) = letra
		FinSi
		
		Para i = 0 Hasta 20 con Paso 1 Hacer
			Escribir Sin Saltar  "[" vector(i) "]"
		FinPara
		Escribir ""
	FinSi
FinAlgoritmo
