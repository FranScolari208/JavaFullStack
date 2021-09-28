Algoritmo precio_Alquiler
	//La empresa “Te llevo a todos lados” está destinada al alquiler de autos y tiene un sistema
	//de tarifa que consiste en cobrar el alquiler por hora. Si el cliente devuelve el auto dentro
	//de las 2 horas de uso el valor que corresponde pagar es de $400 pesos y la nafta va de
	//regalo. Cuando el cliente regresa a la empresa pasadas las 2 horas, se ingresan la
	//cantidad de litros de nafta gastados y el tiempo transcurrido en horas. Luego, se le cobra
	//40 pesos por litro de nafta gastado, y la hora se fracciona en minutos, cobrando un total
	//de $5,20 el minuto de uso. Realice un programa que permita registrar esa información y
	//el total a pagar por el cliente.
	Definir tiempo, litros, precioFinal, precioLitros, precioTiempo Como Real
	
	Escribir "Ingrese la cantidad de horas que el cliente uso el auto"
	Leer tiempo
	
	Si tiempo > 2 Entonces
		
		Escribir "Ingrese la cantidad de litros de nafta gastados"
		Leer litros
		
		precioLitros = litros * 40
		precioTiempo = (tiempo * 60) * 5.2
		
		precioFinal = precioLitros + precioTiempo
		
		Escribir "El total a pagar es: $" precioFinal
	SiNo
		Escribir "El total a pagar es: $400 "
	FinSi
	
	Escribir " "
FinAlgoritmo
