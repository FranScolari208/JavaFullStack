Algoritmo sin_titulo
	//Programe una funci�n que calcule el producto de un arreglo de n�meros enteros. Para
	//esto imagine, por ejemplo, que para un vector V de tama�o 4, el producto de todos los
	//valores es igual a (V[1]*V[2]*V[3]*V[4])
	
	Definir n, i, vector, producto Como Entero
	
	producto = 1
	Escribir "Introduzca el tama�o del vector"
	Leer n
	
	Dimension vector(n)
	Escribir "El vector generado es: "
	
	Para i = 0 Hasta (n - 1) Con Paso 1 Hacer
		vector(i) = Aleatorio(0,50)
		producto = producto * vector(i)
		Escribir Sin Saltar "[" vector(i) "] "
		
	FinPara
	Escribir " "
	Escribir "La suma de los elementos del vector es: " producto
	
FinAlgoritmo
