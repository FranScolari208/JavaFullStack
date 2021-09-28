Algoritmo sin_titulo
	//Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
	//y los muestre por pantalla.
	Definir i, vector1, vector2 Como Entero
	
	Dimension vector1(5)
	Dimension vector2(5)
	
	Para i = 0 hasta 4 Hacer
		
		vector1(i) = Aleatorio(0,9)
		vector2(i) = Aleatorio(0,9)
		
	FinPara
	
	Para i = 0 hasta 4 Hacer
		
		Escribir Sin Saltar "[ " vector1(i) " ]"
		
	FinPara
	Escribir ""
	Para i = 0 hasta 4 Hacer
		
		Escribir Sin Saltar "[ " vector2(i) " ]"
		
	FinPara
	Escribir ""
FinAlgoritmo
