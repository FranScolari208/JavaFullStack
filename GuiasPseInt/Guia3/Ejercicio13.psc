Algoritmo sin_titulo
	//Crear una función llamada “Login”, que recibe un nombre de usuario y una contraseña
	//y que devuelve Verdadero si el nombre de usuario es “usuario1” y si la contraseña es
	//“asdasd”. Además la función calculara el número de intentos que se ha usado para
	//loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la función devolverá
	//Falso.
	Definir usuario, contrasenia como Cadena
	Definir validacion como Logico
	Escribir "Ingrese nombre del usuario"
	Leer usuario
	Escribir "Ingrese contraseña"
	Leer contrasenia
	
	validacion = Login(usuario, contrasenia)
	Si validacion = Verdadero Entonces
		Escribir "Usuario y contraseña CORRECTOS"
	SiNo
		Escribir "Usuario y contraseña INCORRECTOS"
	FinSi
	
FinAlgoritmo

Funcion loguearse <- Login(usuario Por Valor, contrasenia Por Valor)
	Definir intento, restante Como Entero
	Definir usuarioCorrecto, contraseniaCorrecta como Cadena
	Definir loguearse como Logico
	
	intento = 1
	usuarioCorrecto = "usuario1"
	contraseniaCorrecta = "asdasd"
	Loguearse = Falso
	restante = 2
	
	Para intento = 1 Hasta 2  con paso 1 Hacer
		Si usuario = usuarioCorrecto Entonces
			loguearse = Verdadero
		SiNo
			Escribir "Usuario incorrecto, ingrese nuevamente usuario, INTENTOS RESTANTES :" restante
			Leer usuario
			Escribir "Ingrese contraseña"
			Leer contrasenia
			restante = restante - 1
			
		FinSi
	FinPara
FinFuncion
	