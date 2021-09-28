Algoritmo sin_titulo
	//Crear un vector que contenga 100 notas de 100 supuestos estudiantes, con valores entre
	//0 y 20 generadas aleatoriamente mediante el uso de la función azar() o aleatorio() de
	//PseInt. Luego, de acuerdo a las notas contenidas, el programa debe indicar cuántos
	//estudiantes son:
	//	a) Deficientes 0-5
	//	b) Regulares 6-10
	//	c) Buenos 11-15
	//	d) Excelentes 16-20
	
	Definir vector, i, deficientes, regulares, buenos, excelentes Como Entero
	
	Dimension vector(100)
	
	regulares = 0
	deficientes = 0
	buenos = 0
	excelentes = 0
	
	Para i = 0 Hasta 99 con Paso 1 Hacer
		vector(i) = Aleatorio(0, 20)
	FinPara
	
	Para i = 0 Hasta 99 con Paso 1 Hacer
		Si (vector(i) >= 0 y vector(i) <= 5) Entonces
			deficientes = deficientes + 1
		SiNo
			Si (vector(i) >= 6 y vector(i) <= 10) Entonces
				regulares = regulares + 1
			SiNo
				Si (vector(i) >= 11 y vector(i) <= 15) Entonces
					buenos = buenos + 1
				SiNo
					excelentes = excelentes + 1	
				FinSi
			FinSi
		FinSi
			
	FinPara
	
	Escribir "Segun las notas hay alumnos:"
	Escribir "Deficientes: " deficientes
	Escribir "Regulares: " regulares
	Escribir "Buenos: " buenos
	Escribir "Excelentes: " excelentes
	
FinAlgoritmo
