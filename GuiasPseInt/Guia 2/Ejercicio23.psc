Algoritmo sin_titulo
	//Una compañía de seguros tiene contratados a n vendedores. Cada vendedor realiza
	//múltiples ventas a la semana. La política de pagos de la compañía es que cada vendedor
	//recibe un sueldo base más un 10% extra por comisiones de sus ventas. El gerente de la
	//compañía desea saber, por un lado, cuánto dinero deberá pagar en la semana a cada
	//vendedor por concepto de comisiones de las ventas realizadas, y por otro lado, cuánto
	//deberá pagar a cada vendedor como sueldo total (sueldo base + comisiones). Para cada
	//vendedor ingresar cuanto es su sueldo base, cuantas ventas realizó y cuanto cobró por
	//cada venta.
	
	Definir cantVendedores, contador, n, ventas, b, contadorVenta Como Entero
	Definir sueldoBase, dineroVenta, totalVenta, comision, precioFinal Como Real
	
	contador = 0
	contadorVenta = 0
	totalVenta = 0
	
	Escribir "Ingrese la cantidad de Vendedores que tiene: "
	Leer cantVendedores
	
	Para n <- 1 Hasta cantVendedores con Paso 1 Hacer
		
		contador = contador + 1
		
		Escribir "Ingrese el sueldo base del Vendedor Numero " contador ":"
		Leer sueldoBase
		Escribir "Ingrese cuantas ventas realizo ese vendedor"
		Leer ventas
		
		Para b <- 1 Hasta ventas con Paso 1 Hacer
			
			contadorVenta = contadorVenta + 1
			Escribir "Ingrese cuanto cobro el vendedor " contador " en su venta numero " contadorVenta ":"
			Leer dineroVenta
			
			totalVenta = totalVenta + dineroVenta
		FinPara
		
		comision = totalVenta * 0.1 // error aca, es un contador de comisiones de todos los vendedores y tiene q ser de cada vendedor. corregir
		precioFinal = sueldoBase + comision
		
		Escribir "La comision a pagar del vendedor " contador " es: " comision
		Escribir "El sueldo total del vendedor " contador " es: " precioFinal
	FinPara
	
	
FinAlgoritmo
