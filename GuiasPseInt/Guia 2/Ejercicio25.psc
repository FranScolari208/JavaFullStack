Algoritmo descuento_segun_mes
	//Una tienda ofrece para los meses de septiembre, octubre y noviembre un descuento del
	//10% sobre el total de la compra que realiza un cliente. Solicitar al usuario que ingrese un
	//mes y el importe de la compra. El programa debe calcular cuál es el monto total que se
	//debe cobrar al cliente e imprimirlo por pantalla.
	Definir mes como Cadena
	Definir precio, precioFinal Como Real
	Definir condicion como Logico
	
	Escribir "Ingrese el mes en el que se esta realizando la compra "
	Leer mes
	Escribir "Ingrese el importe de la compra"
	Leer precio
	
	condicion = (mes = "septiembre" o mes = "octubre" o mes = "noviembre")
	precioFinal = precio - (precio * 0.1)
	
	Si condicion = Verdadero Entonces
		Escribir "El monto total a pagar con descuento es de: " precioFinal
	SiNo
		Escribir "El monto total a pagar es de: " precio
	FinSi
	
	Escribir " "
	
FinAlgoritmo
