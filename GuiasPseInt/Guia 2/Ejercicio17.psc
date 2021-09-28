Algoritmo eureka
	//Teniendo en cuenta que la clave es “eureka”, escribir un programa que nos pida ingresar
	//una clave. Sólo se cuenta con 3 intentos para acertar, si fallamos los 3 intentos se deberá
	//mostrar un mensaje indicándonos que hemos agotado esos 3 intentos. Si acertamos la
	//clave se deberá mostrar un mensaje que indique que se ha ingresado al sistema
	//correctamente.
	Definir intento Como Entero
	Definir contrasena, palabra como Cadena
	
	intento = 3
	contrasena = "eureka"
	Mientras intento > 0 Hacer
		Escribir "Ingrese la contraseña"
		Leer palabra
		
		Si palabra = contrasena Entonces
			Escribir "La contraseña que ingreso es correcta puede ingresar al sistema"
			intento = intento - intento
		SiNo 
			intento = intento - 1
		FinSi
		
	FinMientras
	
FinAlgoritmo
