Algoritmo sin_titulo
	//Rellenar una matriz, de 3 x 3, con una palabra de 9 de longitud, pedida por el usuario,
	//encontrando la manera de que la frase se muestre de manera continua en la matriz.
	//Por ejemplo, si tenemos la palabra habilidad, nuestra matriz se debería ver así:
	Definir n, m, i, j, contador como Enteros
	Definir palabra, matriz como Cadena
	
	n = 3
	m = 3
	contador = 0
	Dimension matriz(n, m)
	Escribir "Ingrese una palabra de 9 letras"
	Leer palabra
	
	
	palabra = Mayusculas(palabra)
	
	Si Longitud(palabra) = 9 Entonces
		Para i = 0 Hasta (n - 1) con Paso 1 Hacer
			Para j = 0 Hasta (m - 1) con Paso 1 Hacer
				matriz(i, j) = Subcadena(palabra, contador, contador)
				contador = contador + 1
			FinPara
		FinPara
		
		Para i = 0 Hasta (n - 1) con Paso 1 Hacer
			Para j = 0 Hasta (n -1) con Paso 1 Hacer
				Escribir Sin Saltar "[" matriz(i,j) "]"
			FinPara
			Escribir ""
		FinPara
	SiNo
		Escribir "La palabra que ingreso no es de 9 letras"
	FinSi
	
FinAlgoritmo
