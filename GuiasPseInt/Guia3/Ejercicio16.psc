Algoritmo sin_titulo
	//Realizar una funci�n que reciba un numero ingresado por el usuario y averig�e si el
	//n�mero tiene todos sus d�gitos impares (ejemplo: 333, 55, etc.). Para esto vamos a tener
	//que separar el numero en partes (si es un numero de m�s de un digito) y ver si cada
	//numero es par o impar. Nota: recordar el uso de la funci�n Mod y Trunc(). No podemos
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
	