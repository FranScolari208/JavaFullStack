Algoritmo sin_titulo
	//Un docente de Programación tiene un listado de 3 notas registradas por cada uno de
	//sus N estudiantes. La nota final se compone de un trabajo práctico Integrador (35%), una
	//Exposición (25%) y un Parcial (40%). El docente requiere los siguientes informes claves
	//de sus estudiantes:
	
	// *Nota promedio final de los estudiantes que reprobaron el curso. Un estudiante reprueba el curso si tiene una nota final inferior a 6.5
	// *Porcentaje de alumnos que tienen una nota de integrador mayor a 7.5.
	// *La mayor nota obtenida en las exposiciones.
	// *Total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5.
	
	//	El programa pedirá la cantidad de alumnos que tiene el docente y en cada alumno
	//  pedirá las 3 notas y calculará todos informes claves que requiere el docente. Nota: para
	// trabajar este ejercicio de manera prolija, ir probando cada inciso que pide el ejercicio.
	//No hacer todos al mismo tiempo y después probar.
	Definir notaTp, notaEx, notaPa, notaFinal, notaReprobados, promedioReprobados, porcentajePromocion, mayorExposicion como Reales
	Definir alumnos, contador, n, reprobados, promocionanTp, alumnoExposicion, intervaloParcial como Enteros
	
	contador = 1
	reprobados = 0
	notaReprobados = 0
	promocionanTp = 0
	mayorExposicion = 0
	intervaloParcial = 0
	
	Escribir "Hola profesor, ingrese la cantidad de alumnos que tiene: "
	Leer alumnos
	
	Para n <- 0 hasta alumnos - 1 con Paso 1 Hacer
		
		Escribir "Ingrese la nota del trabajo practico integrador del alumno numero " contador ":"
		Leer notaTp
		Escribir "Ingrese la nota de la Exposicion del mismo alumno"
		Leer notaEx
		Escribir "Ingrese la nota de su parcial"
		Leer notaPa
		
		contador = contador + 1
		notaFinal = 0.35 * notaTp + 0.25 * notaEx + 0.4 * notaPa 
		
		Si notaFinal < 6.5 Entonces
			
			reprobados = reprobados +1
			notaReprobados = notaReprobados + notaFinal
			
		FinSi
		
		Si notaTp > 7.5
			
			promocionanTp = promocionanTp + 1
			
		FinSi
		
		Si notaEx > mayorExposicion Entonces
			
			mayorExposicion = notaEx
			alumnoExposicion = contador - 1
			
		FinSi
		
		Si notaPa >= 4.0 y notaPa <= 7.5 Entonces
			
			intervaloParcial = intervaloParcial + 1
			
		FinSi
		
	FinPara
	
	Si reprobados = 0 Entonces
		reprobados = 1
	FinSi
	
	promedioReprobados = notaReprobados / reprobados
	porcentajePromocion = (promocionanTp / alumnos) * 100
	
	Escribir ""
	Escribir "La nota promedio final de los estudiantes que reprobaron el curso es: " promedioReprobados
	Escribir ""
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: " porcentajePromocion "%"
	Escribir ""
	Escribir "La mayor nota obtenida en las exposiciones.es: " mayorExposicion " y es del alumno: " alumnoExposicion
	Escribir ""
	Escribir "La cantidad total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es de: " intervaloParcial
	
	
FinAlgoritmo
