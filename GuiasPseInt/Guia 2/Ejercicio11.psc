Algoritmo operandoConCaracteres
	//Construir un programa que simule un men� de opciones para realizar las cuatro
	//operaciones aritm�ticas b�sicas (suma, resta, multiplicaci�n y divisi�n) con dos valores
	//num�ricos enteros. El usuario, adem�s, debe especificar la operaci�n con el primer
	//car�cter de la operaci�n que desea realizar: �S' o �s� para la suma, �R� o �r� para la resta, �M�
	//o �m� para la multiplicaci�n y �D� o �d� para la divisi�n.
	Definir letra, suma, sumaMayuscula, resta, restaMayuscula, multiplicacion, multiplicacionMayuscula, division, divisionMayuscula Como Caracter
	Definir num1, num2 como Reales
	
	Escribir "Ingrese el primer Numero: "
	Leer num1
	Escribir "Ingrese el segundo Numero: "
	Leer num2
	Escribir "Ahora ingrese la sigla de la operacion que quiere realizarle a ambos numeros: "
	Leer letra
	
	suma = 's'
	sumaMayuscula = 'S'
	resta = 'r'
	restaMayuscula = 'R'
	multiplicacion = 'm'
	multiplicacionMayuscula = 'M'
	division = 'd'
	divisionMayuscula = 'D'

	Segun letra hacer 
		opcion suma :
			Escribir "El resultado de la suma de ambos numeros es: " num1 + num2
		opcion sumaMayuscula :
			Escribir "El resultado de la suma de ambos numeros es: " num1 + num2
		opcion resta :
			Escribir "El resultado de la resta de ambos numeros es: " num1 - num2
		opcion restaMayuscula :
			Escribir "El resultado de la resta de ambos numeros es: " num1 - num2
		opcion multiplicacion :
			Escribir "El resultado de la multiplicacion de ambos numeros es: " num1 * num2
		opcion multiplicacionMayuscula :
			Escribir "El resultado de la multiplicacion de ambos numeros es: " num1 * num2
		opcion division :
			Escribir "El resultado de la division de ambos numeros es: " num1 / num2
		opcion divisionMayuscula :
			Escribir "El resultado de la division de ambos numeros es: " num1 / num2
			
	FinSegun
	
FinAlgoritmo
