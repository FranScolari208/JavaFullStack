Algoritmo sin_titulo
	//Crear una funci�n llamada �Login�, que recibe un nombre de usuario y una contrase�a
	//y que devuelve Verdadero si el nombre de usuario es �usuario1� y si la contrase�a es
	//�asdasd�. Adem�s la funci�n calculara el n�mero de intentos que se ha usado para
	//loguearse, tenemos solo 3 intentos, si nos quedamos sin intentos la funci�n devolver�
	//Falso.
	Definir usuario, contrasenia como Cadena
	Definir validacion como Logico
	Escribir "Ingrese nombre del usuario"
	Leer usuario
	Escribir "Ingrese contrase�a"
	Leer contrasenia
	
	validacion = Login(usuario, contrasenia)
	Si validacion = Verdadero Entonces
		Escribir "Usuario y contrase�a CORRECTOS"
	SiNo
		Escribir "Usuario y contrase�a INCORRECTOS"
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
			Escribir "Ingrese contrase�a"
			Leer contrasenia
			restante = restante - 1
			
		FinSi
	FinPara
FinFuncion
	