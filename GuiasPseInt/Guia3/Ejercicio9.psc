Algoritmo conPalabras
	
	concatenarCaracteres()
	
FinAlgoritmo

SubProceso concatenarCaracteres()
	
	Definir concatenacion, frase, palabra como Cadena
	Definir n Como Entero
	Definir vocalA, vocalE, vocalI, vocalO, vocalU, vocalA2, vocalE2, vocalI2, vocalO2, vocalU2 Como Caracter
	
	Escribir "Ingrese una palabra/frase/secuencia de caracteres y terminela en punto"
	Leer palabra
	
	frase = " "
	n = 0
	vocalA = "a"
	vocalA2 = "A"
	vocalE = "e"
	vocalE2 = "E"
	vocalI = "i"
	vocalI2 = "I"
	vocalO = "o"
	vocalO2 = "O"
	vocalU = "u"
	vocalU2 = "U"
	concatenacion = " "
	
	Mientras frase <> "."  Hacer
		
		frase = Subcadena(palabra, n, n)
		
		Segun frase Hacer
			vocalA, vocalA2: frase = "@"
				
			vocalE, vocalE2: frase = "#"
				
			vocalI, vocalI2: frase = "$"
				
			vocalO, vocalO2: frase = "%"
				
			vocalU, vocalU2: frase = "*"
				
			De Otro Modo:
				frase = frase
		FinSegun
		
		concatenacion = concatenar(concatenacion, frase)
		n = n + 1
	FinMientras
	Escribir " La nueva frase es" concatenacion
	FinSubProceso
	