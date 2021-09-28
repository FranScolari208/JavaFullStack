Algoritmo sin_titulo
	//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el 
	//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a 
	//buscar también debe ser ingresado por el usuario). El programa debe indicar la posición 
	//donde se encuentra el valor. En caso que el número se encuentre repetido dentro del 
	//arreglo se deben imprimir todas las posiciones donde se encuentra ese valor. 
	//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar 
	//un mensaje
	Definir vector, n, i como Entero
	Definir condicion, contador Como Entero
	Definir inicio como Caracter
	
	Escribir "Tamaño del vector"
	Leer n
	
	Dimension vector(n)
	contador = 0
	Para i = 0 hasta n - 1 Hacer
		
		Escribir "Ingrese el valor de la posicion: " i " para el primer vector"
		Leer vector(i)
		
	FinPara
	
	Para i = 0 Hasta n - 1 Hacer
		
		Escribir Sin Saltar "[ " vector(i) " ]"
		
	FinPara
	
	Escribir " "
	
	Escribir "Ingrese un valor que quiera ver si esta en el vector"
	Leer condicion
	
	Para i = 0 Hasta n - 1 Hacer
		
		Si condicion = vector(i) Entonces
			Escribir "El valor " condicion " se encuentra en la posicion: " i
			contador = contador + 1
			
		FinSi
		
	FinPara
	
	Si contador = 0 Entonces
		Escribir "El valor " condicion " no se encuentra en ninguna posicion del vector"
	FinSi
	
FinAlgoritmo
