Algoritmo sin_titulo
	//Realizar una función que reciba un numero ingresado por el usuario y averigüe si el
	//número tiene todos sus dígitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
	//que separar el numero en partes (si es un numero de más de un digito) y ver si cada
	//numero es par o impar. Nota: recordar el uso de la función Mod y Trunc(). No podemos
	//pasar el numero a cadena para realizar el ejercicio.
	Definir num Como Entero
	Definir resultado como Logico
	
	Escribir "Ingrese un numero"
	Leer num
	
	resultado = digitosImpares(num)
	
	Si resultado = Verdadero Entonces
		Escribir "El numero que ingreso tiene todos digitos impares"
	SiNo
		Escribir "El numero que ingreso NO tiene todos digitos impares"
	FinSi
	
FinAlgoritmo

Funcion verificacion <- digitosImpares(num)
	
	
FinFuncion
	