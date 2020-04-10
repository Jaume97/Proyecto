# ProyectoJaumeEstevezCapon

## 06/04/2020

### Introduccion a la programacion

#### Resolucion de problemas

En este apartado he visto como es el **principio** de todos los programas, como comportarse ante el **problema**,como **evolucionó** los *sistemas de información* y como empezar a *diseñar* una **solucion**

#### Analisis del problema

En este apartado se **explica** que debemos comprender el problema y *acomodarnos* a el, buscando informacion sobre **todo** lo relacionado con el problema para asi diseñar mejor nuestro **programa**.

#### Diseño de algoritmos

En este apartado *explica* las diferentes formas de diseño de programas como son el *pseudocodigo* y los *diagramas de flujo* (Todos ellos muy por encima).

#### Entorno de Trabajo: PSeInt

En este apartado se instala el entorno de desarrollo **PSeInt**.

#### Pseudocodigo:Introduccion

En este apartado he adquirido conocimientos (*ya los tenia*) de: 

* Estructura del pseudocodigo.
* Tipos de datos simples.
* Variables.
* Operadores y expresiones.
* Asignación de variables.

## 10/04/2020

* Entrada y salida de datos en Pseudocodigo (** leer y escribir **).
* Algunas nuevas instrucciones de Pseudocodigo (** Borrar pantalla, esperar x segundos, escribir sin saltar etc..**).
* Funciones matematicas(**rc-> Raiz cuadrada, sen-> Seno, aleatorio(10,20)-> Numero aleatorio entre 10 y 20**).
* Funciones de cadenas de caracteres (** longitud, subcadena, ConvertirATexto, ConvertirANumero etc..**).
* Depuracion de Pseudocodigo.

Empezamos realizando ejercicios paso a paso.

##### Ejercicio3

```
Proceso CalcularHipotenusa
	Definir cateto1,cateto2,hipotenusa Como Real;
	Escribir "Introduce el cateto 1:";
	Leer cateto1;
	Escribir "Introduce la cateto 2:";
	Leer cateto2;
	hipotenusa <- raiz(cateto1 ^ 2 + cateto2 ^ 2);
	Escribir "La hipotenusa es ",hipotenusa;
FinProceso
```

##### Ejercicio10

```
Proceso CalcularNota
	Definir parcial1,parcial2,parcial3,examen,trabajo,nota como Real;
	Escribir "Dime la nota del parcial 1:";
	Leer parcial1;
	Escribir "Dime la nota del parcial 2:";
	Leer parcial2;
	Escribir "Dime la nota del parcial 3:";
	Leer parcial3;
	Escribir "Dime la nota del examen:";
	Leer examen;
	Escribir "Dime la nota del trabajo:";
	Leer trabajo;
	nota <- ((parcial1 + parcial2 + parcial3)/3)*0.55 + 0.3*examen + 0.15*trabajo;
	Escribir "Nota final:", nota;
FinProceso
```

##### Ejercicio15 (Intercambio de valores a variables) 

```
Proceso IntercambiarVariables
	Definir a,b,aux como Entero;
	Escribir "Introduce valor de la variable A:";
	Leer a;
	Escribir "Introduce valor de la variable B:";
	Leer b;
	aux <- a;
	a <- b;
	b <- aux;
	Escribir "Nuevo valor de A:", a;
	Escribir "Nuevo valor de B:", b;
FinProceso
```

##### Ejercicio17

```
Proceso CalcularHoraLlegada
	Definir horapartida, minpartida, segpartida, seginicial, segfinal,segviaje, horallegada, minllegada, segllegada Como Entero;
	Escribir Sin Saltar "Hora de salida:";
	Leer horapartida;
	Escribir Sin Saltar "Minutos de salida:";
	Leer minpartida;
	Escribir Sin Saltar "Segundos de salida:";
	Leer segpartida;
	Escribir Sin Saltar "Tiempo que has tardado en segundos:";
	Leer segviaje;
	seginicial <- horapartida * 3600 + minpartida*60 + segpartida;
	segfinal <- seginicial + segviaje;
	horallegada <- trunc(segfinal / 3600);
	minllegada <- trunc((segfinal % 3600) / 60);
	segllegada <- (segfinal % 3600) % 60;
	Escribir "Hora de llegada";
	Escribir horallegada,":",minllegada,":",segllegada;
	
FinProceso
```

##### Ejercicio18

```
Proceso Iniciales
	Definir nombre,apellido1,apellido2,inicial como Cadenas;
	Escribir Sin Saltar "Dime tu nombre:";
	Leer nombre;
	Escribir Sin Saltar "Dime tu primer apellido:";
	Leer apellido1;
	Escribir Sin Saltar "Dime tu segundo apellido:";
	Leer apellido2;
	inicial<-subcadena(nombre,0,0);
	inicial<-concatenar(inicial,subcadena(apellido1,0,0));
	inicial<-concatenar(inicial,subcadena(apellido2,0,0));
	inicial<-Mayusculas(inicial);
	Escribir "Las iniciales son: ",inicial;
FinProceso
```

#### Pseudocodigo: Estructuras alternativas

En este apartado nos explica como funcionan la estructura **si**, **si sino** (*if ifelse*) y **segun**(*Switch*).

Ejercicios *paso a paso*:

##### Ejercicio2

```
Proceso CalcularPositivoNegativoCero
	Definir num como Entero;
	Escribir "Dime el número :";
	Leer num;
	Si num=0 Entonces
		Escribir "Es igual a 0";
	SiNo
		Si num>0 Entonces
			Escribir "Es positivo";
		SiNo
			Escribir "Es negativo";
		FinSi
	FinSi
FinProceso
```

##### Ejercicio5

```
Proceso Login
	Definir usuario, password como Cadena;
	Escribir Sin Saltar "Introduce el usuario:";
	Leer usuario;
	Escribir Sin Saltar "Introduce el password:";
	Leer password;
	Si usuario="pepe" Y password="asdasd" Entonces
		Escribir "Has entrado al sistema";
	SiNo
		Escribir "Usuario/password incorrecto";
	FinSi
FinProceso
```

##### Ejercicio9

```
Proceso OrdenarNumeros
	Definir num1,num2,num3 Como Entero;
	Escribir "Dime el número 1:";
	Leer num1;
	Escribir "Dime el número 2:";
	Leer num2;
	Escribir "Dime el número 3:";
	Leer num3;
	Si num1>num2 Y num1>num3 Entonces
		Si num2>num3 Entonces
			Escribir num1," ",num2," ",num3;
		SiNo
			Escribir num1," ",num3," ",num2;
		FinSi
	FinSi
	Si num2>num1 Y num2>num3 Entonces
		Si num1>num3 Entonces
			Escribir num2," ",num1," ",num3;
		SiNo
			Escribir num2," ",num3," ",num1;
		FinSi
	FinSi
	Si num3>=num1 Y num3>=num2 Entonces
		Si num1>num2 Entonces
			Escribir num3," ",num1," ",num2;
		SiNo
			Escribir num3," ",num2," ",num1;
		FinSi
	FinSi
	
FinProceso
```

##### Ejercicio13

```
Proceso FechaCorrecta
	Definir dia,mes,year Como Entero;
	Definir dias_del_mes Como Entero;
	Escribir Sin Saltar "Introduce el dia:";
	Leer dia;
	Escribir Sin Saltar "Introduce el mes:";
	Leer mes;
	Escribir Sin Saltar "Introduce el año:";
	Leer year;
	Segun mes Hacer
		1,3,5,7,8,10,12:
			dias_del_mes<-31;
		4,6,9,11:
			dias_del_mes<-30;
		2:
			Si (year % 4 = 0 Y NO (year % 100 = 0)) O year % 400 = 0 Entonces
				dias_del_mes <- 29;
			SiNo
				dias_del_mes <- 28;
			FinSi
		De Otro Modo:
				Escribir "Fecha incorrecta";
		FinSegun
		Si dia<0 O dia>dias_del_mes Entonces
			Escribir "Fecha incorrecta";
		SiNo
			Escribir "Fecha correcta";
		FinSi
FinProceso
```

> (year % 4 = 0 Y NO (year % 100 = 0)) O year % 400 = 0 : Calculo para saber si un año es bisiesto.
