Algoritmo caracterCorrecto
	//Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario
	//ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla
	//que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
	Definir letra Como Caracter
	
	Escribir "Ingrese S o N"
	Leer letra
	
	Si letra = 'S' || letra = 'N' Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
	
FinAlgoritmo
