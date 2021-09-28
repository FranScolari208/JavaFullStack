Algoritmo sin_titulo
	
	Definir nombre, dia, turno, festivo como Caracter
	Definir horas Como Entero
	Definir jornal como Real
	
	Escribir "Ingrese nombre del trabajador"
	Leer nombre
	Escribir "Ingrese el dia de la semana"
	Leer dia
	Escribir "Ingrese el turno diurno o nocturno"
	Leer turno
	Escribir "Ingrese la cantidad de horas trabajadas"
	Leer horas
	Escribir "Fue un dia festivo?"
	Leer festivo
	
	jornal = calculoDeJornal(dia, turno, horas, festivo)
	
	Si jornal <> 0 Entonces
		Escribir "RESUMEN DE JORNAL A PAGAR"
		Escribir "---------------------------------------------------"
		Escribir "NOMBRE DEL TRABAJADOR: " Mayusculas(nombre)
		Escribir "DIA EN EL QUE TRABAJO : " Mayusculas(dia)
		Escribir "TURNO EN EL QUE TRABAJO : " Mayusculas(turno)
		Escribir "LA CANTIDAD DE HORAS TRABAJADAS SON: " horas
		Escribir "FESTIVO? " festivo
		Escribir "---------------------------------------------------"
		Escribir "TOTAL A PAGAR = " jornal
		
	SiNo
		Escribir "Algunos de los datos ingresados son incorrectos"
	FinSi
	
FinAlgoritmo

Funcion sueldo <- calculoDeJornal(dia Por Valor, turno Por Valor, horas Por Valor, festivo Por Valor)
	
	Definir sueldo como Real
	Definir turnoDia, turnoNoche, lunes, martes, miercoles, jueves, viernes, sabado, domingo, festivoSi, festivoNo Como Caracter
	Definir valoresCorrectos, diaCorrecto Como Logico

	turnoDia = "diurno"
	turnoNoche = "nocturno"
	festivoSi = "si"
	festivoNo = "no"
	lunes = "lunes"
	martes = "martes"
	miercoles = "miercoles"
	jueves = "jueves"
	viernes = "viernes"
	sabado = "sabado"
	domingo = "domingo"
	
	Segun dia Hacer
			lunes: diaCorrecto = Verdadero
			martes: diaCorrecto = Verdadero
			miercoles: diaCorrecto = Verdadero
			jueves: diaCorrecto = Verdadero
			viernes: diaCorrecto = Verdadero
			sabado: diaCorrecto = Verdadero
			domingo: diaCorrecto = Verdadero
			De Otro Modo:
			diaCorrecto = Falso
		FinSegun
		
	valoresCorrectos = (horas > 0) y ( diaCorrecto = Verdadero) y ((turno = turnoDia) o (turno = turnoNoche)) y ( (festivo = festivoSi) o (festivo = festivoNo))
		
	Si valoresCorrectos = Verdadero Entonces
		Si festivo = festivoSi Entonces
			Si turno = turnoDia Entonces
				sueldo = horas * 99
			SiNo 
				sueldo = horas * 143.75
			FinSi
		SiNo
			Si turno = turnoDia Entonces
				sueldo = horas * 90
			SiNo 
				sueldo = horas * 125
			FinSi
		FinSi
	SiNo
		sueldo = 0
	FinSi
	
FinFuncion
