Algoritmo fechaValida

	Definir dia, mes, ano Como Entero
	Definir condicion28, condicion30, condicion31, condicionMes Como Logico
	Definir dato, enero, febrero, marzo, abril, mayo, junio, julio, agosto, septiembre, octubre, noviembre, diciembre como Cadena
	
	Escribir "Ingrese un dia en numero"
	Leer dia
	Escribir "Ingrese un mes en numero"
	Leer mes
	Escribir "Ingrese un año"
	Leer ano
	
	condicionMes = mes > 0 y mes <= 12
	condicion31 = (mes = 1 o mes = 3 o mes = 5 o mes = 7 o mes = 8 o mes = 10 o mes = 12)
	condicion30 = (mes = 4 o mes = 6 o mes = 9 o mes = 11)
	condicion28 = (mes = 2)
	dato = ""
	enero = "Enero"
	febrero = "Febrero"
	marzo = "Marzo"
	abril = "Abril"
	mayo = "Mayo"
	junio = "Junio"
	julio = "Julio"
	agosto = "Agosto"
	septiembre = "Septiembre"
	octubre = "Octubre"
	noviembre = "Noviembre"
	diciembre = "Diciembre"
	
	Si condicionMes = Verdadero Entonces
		
		Segun mes Hacer
			1 : dato = enero
			2 : dato = febrero
			3 : dato = marzo
			4 : dato = abril
			5 : dato = mayo
			6 : dato = junio
			7 : dato = julio
			8 : dato = agosto
			9 : dato = septiembre
			10 : dato = octubre
			11 : dato = noviembre
			12 : dato = diciembre
		FinSegun
		
		Si condicion31 = Verdadero Entonces
			
			Si dia > 0 y dia <= 31 Entonces
				Escribir dia " de " dato " del " ano
			SiNo 
				Escribir "La fecha no es valida"
			FinSi
		FinSi
			
		Si condicion30 = Verdadero Entonces
			
			Si dia > 0 y dia <= 30 Entonces
				Escribir dia " de " dato " del " ano
			SiNo 
				Escribir "La fecha no es Valida"
			FinSi
		FinSi
		
		Si condicion28 = Verdadero Entonces
			Si dia > 0 y dia <= 28 Entonces
				Escribir dia " de " dato " del " ano
			SiNo 
				Escribir "La fecha no es Valida"
			FinSi
		FinSi
		
	SiNo
		Escribir "La fecha no es valida"
	FinSi
	
FinAlgoritmo
