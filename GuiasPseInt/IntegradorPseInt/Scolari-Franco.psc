Algoritmo apocalipsis_zombie
// Franco Scolari Ejercicio Integrador
//Variable de Entrada : secuenciaCaracteres
//Varieble de Salida : muestraDeMatriz, mensaje de que la secuencia no es valida, mensaje de que la secuencia es gen z y mensaje de que la secuencia no lo es
	Definir secuenciaCaracteres, matriz Como Caracter
	Definir largoCadena, m Como Entero
	
	Escribir "Ingrese una secuencia de caracteres"
	Leer secuenciaCaracteres 
	
	largoCadena = longitud(secuenciaCaracteres)
	
	Si (validacionCadena(secuenciaCaracteres, largoCadena) = Verdadero) Entonces
		m = dimensionMatriz(largoCadena)
		Dimension matriz(m, m)
		armadoDeMatriz(matriz, secuenciaCaracteres, m)
		muestraDeMatriz(matriz, m)
		comprobacionDeGenZ(matriz, m)
	SiNo
		Escribir "LA MUESTRA NO CORRESPONDE A UNA SECUENCIA VALIDA" 
	FinSi
	
FinAlgoritmo 

//--------------------------------------------------------------------------------------
Funcion esValida = validacionCadena(secuenciaCaracteres, largoCadena)
	Definir esValida Como Logico
	Definir validacion, contadorLetras, i Como Entero
	Definir vectorCaracteres Como Caracter
	
	Dimension vectorCaracteres(largoCadena)
	contadorLetras = 0
	
	Si largoCadena = 9 | largoCadena = 16 | largoCadena = 1369 Entonces
		Para i = 0 Hasta (largoCadena - 1) Hacer
			
			vectorCaracteres(i) = Subcadena(secuenciaCaracteres, i, i)
			
			Si (vectorCaracteres(i) = 'A'| vectorCaracteres(i) = 'B'| vectorCaracteres(i) = 'C'| vectorCaracteres(i) = 'D') Entonces
				
				contadorLetras = contadorLetras + 1
				
			FinSi
		FinPara
		Si contadorLetras = largoCadena Entonces
			esValida = Verdadero
		SiNo
			esValida = Falso
		FinSi
		
	SiNo
		esValida = Falso
	FinSi
	
FinFuncion

//---------------------------------------------------------------------------------------
Funcion m = dimensionMatriz(largoCadena)
	Definir m Como Entero
	Segun largoCadena Hacer
		9: m = 3
		16: m = 4
		1369: m = 37
	FinSegun
FinFuncion

//----------------------------------------------------------------------------------------
SubProceso armadoDeMatriz(matriz Por Referencia, secuenciaCaracteres, m)
	Definir i, j, seguimientoCadena Como Entero

	seguimientoCadena = 0
	
	Para i = 0 Hasta (m - 1) Con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			matriz(i,j) = Subcadena(secuenciaCaracteres, seguimientoCadena, seguimientoCadena)
			seguimientoCadena = seguimientoCadena + 1
		FinPara
	FinPara

FinSubProceso
//-----------------------------------------------------------------------------------------
SubProceso muestraDeMatriz(matriz Por Referencia, m)
	Definir i, j como Entero
	
	Para i = 0 Hasta (m - 1) Con Paso 1 Hacer
		Para j = 0 Hasta (m - 1) con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(i,j) "] " 
		FinPara
		Escribir ""
	FinPara
	Escribir ""
FinSubProceso
//-----------------------------------------------------------------------------------------
SubProceso comprobacionDeGenZ(matriz Por Referencia, m)
	Definir i, j, contadorLetra, diagonales Como Entero
	Definir letra Como Caracter
	
	contadorLetra = 0
	diagonales = 0
//------------------------------Comprobacion de diagonal a derecha-------------------------
	Para i = 0 Hasta (m - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m -1) con Paso 1 Hacer
			Si (i = 0 & j = 0) Entonces
				letra = matriz(i,j)
				contadorLetra = contadorLetra + 1
			SiNo
				Si i = j Entonces
					Si matriz(i,j) = letra Entonces
						contadorLetra = contadorLetra + 1
					FinSi
				FinSi
			FinSi
		FinPara
		
	FinPara
	Si contadorLetra = m Entonces
		diagonales = diagonales + 1
	FinSi
	
//------------------------------Comprobacion de diagonal a izquierda --------------------------
	contadorLetra = 0 // reinicio contador
	Para i = 0 Hasta (m - 1) con Paso 1 Hacer
		Para j = 0 Hasta (m -1) con Paso 1 Hacer
			Si (i = 0 & j = (m - 1)) Entonces
				letra = matriz(i,j)
				contadorLetra = contadorLetra + 1
			SiNo
				Si (i + j) = (m - 1) Entonces
					Si matriz(i,j) = letra Entonces
						contadorLetra = contadorLetra + 1
					FinSi
				FinSi
			FinSi
			
		FinPara
		
	FinPara
	
	Si contadorLetra = m Entonces
		diagonales = diagonales + 1
	FinSi
//-------------------Compobacion de si ambas diagonales cumplen-------------------------------
	Si diagonales = 2 Entonces
		Escribir "SE HA DETECTADO EL GEN Z" 
	SiNo
		Escribir "NO SE HA DETECTADO EL GEN Z"
	FinSi
FinSubProceso



	