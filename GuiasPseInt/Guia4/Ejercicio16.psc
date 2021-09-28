Algoritmo sin_titulo
	//Crear dos vectores que tengan el mismo tamaño (el tamaño se pedirá por teclado) y
	//almacenar en uno de ellos nombres de personas como cadenas. En el segundo vector
	//se debe almacenar la longitud de cada uno de los nombres (para ello puedes usar la
	//función Longitud() de PseInt). Mostrar por pantalla cada uno de los nombres junto con su
	//longitud.
	Definir vector1 como Cadena
	Definir nombres, i, vector2 como Entero
	
	Escribir "Ingrese la cantidad de nombres que va a introducir"
	Leer nombres
	
	Dimension vector1(nombres)
	Dimension vector2(nombres)
	
	Para i = 0 hasta (nombres - 1) con paso 1 Hacer
		Escribir "Ingrese un nombre para la posicion " i
		Leer vector1(i)
		vector2(i) = Longitud(vector1(i))
	FinPara
	
	Para i = 0 Hasta (nombres - 1) Con Paso 1 Hacer
		Escribir Sin Saltar "[" vector1(i) "] "
	FinPara
	Escribir ""
	
	Para i = 0 Hasta (nombres - 1) Con Paso 1 Hacer
		Escribir Sin Saltar "[ " vector2(i) " ] "
	FinPara
	Escribir ""
FinAlgoritmo
