Algoritmo sueldoMinimo
	//Un hombre desea saber si su sueldo es mayor al sueldo mínimo, el programa le pedirá
	//al usuario su sueldo actual y el sueldo mínimo. Si el sueldo es mayor al mínimo se debe
	//mostrar un mensaje por pantalla indicándolo.
	Definir sueldoMin, sueldoUsuario Como Real
	
	Escribir "Introduzca el sueldo minimo"
	Leer sueldoMin
	Escribir "Introduzca su sueldo"
	Leer sueldoUsuario
	
	Si sueldoUsuario > sueldoMin Entonces
		Escribir "¡Su sueldo supera el sueldo minimo!"
	FinSi
FinAlgoritmo
