Algoritmo sueldoMinimo
	//Un hombre desea saber si su sueldo es mayor al sueldo m�nimo, el programa le pedir�
	//al usuario su sueldo actual y el sueldo m�nimo. Si el sueldo es mayor al m�nimo se debe
	//mostrar un mensaje por pantalla indic�ndolo.
	Definir sueldoMin, sueldoUsuario Como Real
	
	Escribir "Introduzca el sueldo minimo"
	Leer sueldoMin
	Escribir "Introduzca su sueldo"
	Leer sueldoUsuario
	
	Si sueldoUsuario > sueldoMin Entonces
		Escribir "�Su sueldo supera el sueldo minimo!"
	FinSi
FinAlgoritmo
