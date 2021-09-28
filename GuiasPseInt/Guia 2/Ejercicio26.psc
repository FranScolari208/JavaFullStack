Algoritmo sin_titulo
	//Solicitar al usuario que ingrese dos números enteros y determinar si ambos son pares o
	//impares. Mostrar en pantalla un mensaje que indique “Ambos números son pares”
	//siempre y cuando cumplan con la condición. En caso contrario se deberá imprimir el
	//siguiente mensaje “Los números no son pares, o uno de ellos no es par”.
	//Nota: investigar la función mod de Pseint.
	Definir num1, num2 como Enteros
	Definir condicion1, condicion2 Como Logico
	
	Escribir "Ingrese un numero Entero"
	Leer num1
	Escribir "Ingrese otro numero Entero"
	Leer num2
	
	condicion1 = ( num1 mod 2 = 0 y num2 mod 2 = 0 )
	condicion2 = ( num1 mod 2 = 1 y num2 mod 2 = 1 )
	
	Si condicion1 = Verdadero entonces 
		Escribir "Los numeros que usted ingreso son ambos pares"
	SiNo 
		Si condicion2 = Verdadero Entonces
			Escribir "Los numeros que usted ingreso son ambos impares"
		SiNo
			Escribir "Los numeros no son pares, o uno de ellos no lo es"
		FinSi
	FinSi
	
	Escribir " "
FinAlgoritmo
