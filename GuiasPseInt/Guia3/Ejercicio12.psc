Algoritmo sin_titulo
	//Diseñar una función que reciba un numero en forma de cadena y lo devuelva como
	//numero entero. El programa podrá recibir números de hasta 3 dígitos. Nota: no poner
	//números con decimales
	Definir num como Cadena
	Definir resultado como Entero
	
	Escribir "Ingrese un numero de hasta tres digitos escribiendo numero por numero"
	Leer num
	
	num = Minusculas(num)
	resultado = lecturaDigitos(num)
FinAlgoritmo

Funcion lectura <- lecturaDigitos(num) 
	Definir largo, i, a, b, c, d, lectura1, lectura2, lectura3 Como Entero
	Definir opcion0, opcion1, opcion2, opcion3, opcion4, opcion5, opcion6, opcion7, opcion8, opcion9, concatenacion, concatenacion2, concatenacion3, frase, frase2, frase3 como Cadena
	
	largo = Longitud(num)
	opcion0 = "cero"
	opcion1 = "uno"
	opcion2 = "dos"
	opcion3 = "tres"
	opcion4 = "cuatro"
	opcion5 = "cinco"
	opcion6 = "seis"
	opcion7 = "siete"
	opcion8 = "ocho"
	opcion9 = "nueve"
	concatenacion = ""
	concatenacion2 = ""
	concatenacion3 = ""
	frase2 = ""
	frase3 =""
	lectura1 = 0
	lectura2 = 0
	lectura3= 0
	i = 0
	a = 0
	b = 0
	c = 0
	d = 0
	
	Para i = 0 Hasta (largo - 1) con paso 1 Hacer
		frase = Subcadena(num, i, i)
		concatenacion = Concatenar(concatenacion, frase)
		
		Segun concatenacion Hacer
			opcion0: lectura1 = 0
			opcion1: lectura1= 1
			opcion2: lectura1 = 2
			opcion3: lectura1 = 3
			opcion4: lectura1 = 4
			opcion5: lectura1 = 5
			opcion6: lectura1 = 6
			opcion7: lectura1 = 7
			opcion8: lectura1 = 8
			opcion9: lectura1 = 9
				
		FinSegun
		
		Si frase = " " Entonces
			a = i + 1
			Para b = a Hasta (largo -1 ) con paso 1 Hacer
				frase2 = Subcadena(num, b, b)
				concatenacion2 = Concatenar(concatenacion2, frase2)
				
				Segun concatenacion2 Hacer
					opcion0: lectura2 = 0
					opcion1: lectura2 = 1
					opcion2: lectura2 = 2
					opcion3: lectura2 = 3
					opcion4: lectura2 = 4
					opcion5: lectura2 = 5
					opcion6: lectura2 = 6
					opcion7: lectura2 = 7
					opcion8: lectura2 = 8
					opcion9: lectura2 = 9
						
				FinSegun
			
					Si frase2 = " " Entonces
					c = b + 1
						Para d = c Hasta (largo -1 ) con paso 1 Hacer
						frase3 = Subcadena(num, d, d)
						concatenacion3 = Concatenar(concatenacion3, frase3)
						
							Segun concatenacion3 Hacer
							opcion0: lectura3 = 0
							opcion1: lectura3 = 1
							opcion2: lectura3 = 2
							opcion3: lectura3 = 3
							opcion4: lectura3 = 4
							opcion5: lectura3 = 5
							opcion6: lectura3 = 6
							opcion7: lectura3 = 7
							opcion8: lectura3 = 8
							opcion9: lectura3 = 9
								
							FinSegun
						
						FinPara
					FinSi
			FinPara
			
		FinSi
	
	FinPara
	
	Si c <> 0 Entonces
		Escribir "El numero ingresado es: " lectura1 lectura2 lectura3
	SiNo
		Si a <> 0 Entonces
			Escribir "El numero ingresado es: " lectura1 lectura2
		SiNo
			Escribir "El numero ingresado es: " lectura1
				
		FinSi
	FinSi
	
FinFuncion


