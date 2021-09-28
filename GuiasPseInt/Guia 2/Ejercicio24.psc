Algoritmo promedio_3_notas
	//Realizar un programa que pida tres notas y determine si un alumno aprueba o reprueba
	//un curso, sabiendo que aprobará el curso si su promedio de tres calificaciones es mayor
	//o igual a 70; y reprueba en caso contrario.
	
	Definir nota1, nota2, nota3, suma , promedio como Real
	
	Escribir "Ingrese la primer nota del alumno"
	Leer nota1
	Escribir "Ingrese la segunda nota del alumno"
	Leer nota2
	Escribir "Ingrese la tercer nota del alumno"
	Leer nota3
	
	suma = nota1 + nota2 + nota3
	promedio = suma / 3
	
	Si promedio >= 7 Entonces
		Escribir "El alumno esta aprobado y su calificacion es: " promedio
	SiNo 
		Escribir "El alumno esta reprobado y su calificacion es: " promedio
	FinSi
	
	Escribir " "
	
FinAlgoritmo
