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

## 13/04/2020

#### Pseudocodigo: Estructuras repetitivas

En este apartado se **explica** las siguientes estructuras: 

* Mientras.
* Repetir-Hasta que.
* Para.
* Contadores,Acumuladores y Indicadores.

##### Ejercicio1

```
Proceso Factorial
	Definir num,contador Como Entero;
	Definir resultado Como Real;
	resultado <- 1;
	Escribir Sin Saltar "Dime un número:";
	Leer num;
	contador <- 2;
	Mientras contador<=num Hacer
		resultado <- resultado * contador;
		contador <- contador + 1;
	FinMientras
	Escribir "El resultado es ", resultado;
FinProceso
```

##### Ejercicio3

```
Proceso CalcularSumaMedia
	Definir num Como Entero;
	Definir suma,cont como Entero;
	Definir media Como Real;
	suma <- 0;
	cont <-0;
	Escribir "Número (0 para salir):";
	Leer num;
	Mientras num<>0 Hacer
		suma <- suma + num;
		cont <- cont + 1;
		Escribir "Número (0 para salir):";
		Leer num;
	FinMientras
	Si cont>0 Entonces
		media <- suma / cont;
	SiNo
		media <-0;
	FinSi
	
	Escribir "Suma:",suma;
	Escribir "Media:",media;
FinProceso
```

##### Ejercicio7

```
Proceso TablaMultiplicar
	Definir tabla,num Como Entero;
	Escribir Sin Saltar "¿De qué número quieres mostrar la tabla de multiplicar?:";
	Leer tabla;
	Para num<-1 hasta 10 Hacer
		Escribir num," * ",tabla," = ",num*tabla;
	FinPara
FinProceso
```

##### Ejercicio10

```
Proceso TablasDeMultiplicar
	Definir tabla,num Como Entero;
	Para tabla<-1 hasta 5 Hacer
		Para num<-1 hasta 10 Hacer
			Escribir tabla," * ",num," = ", tabla*num;
		FinPara
		Esperar Tecla;
	FinPara
FinProceso
```

##### Ejercicio11

```
Proceso EsPrimo
	Definir numero_es_primo,num Como Entero;
	Definir es_primo Como Logico;
	es_primo<-Verdadero;
	Escribir Sin Saltar "Introduce un número para comprobar si es primo:";
	Leer numero_es_primo;
	Para num<-2 hasta rc(numero_es_primo) Hacer
		Si numero_es_primo % num = 0 Entonces
			es_primo <- Falso;
		FinSi
	FinPara
	Si es_primo Entonces
		Escribir "Es Primo";
	SiNo
		Escribir "No es Primo";
	FinSi
FinProceso
```

##### Ejercicio1 (Caracteres)

```
Proceso EscribirCaracteres
	Definir cad Como Caracter;
	Definir posicion Como Entero;
	Escribir "Introduce una cadena:";
	Leer cad;
	Para posicion<-0 hasta Longitud(cad)-1 Hacer
		Escribir Subcadena(cad,posicion,posicion);
	FinPara
FinProceso
```

##### Ejercicio2 (Caracteres)

```
Proceso ComienzaPor
	Definir cad,subcad Como Caracter;
	Escribir Sin Saltar "Introduce una cadena:";
	Leer cad;
	Escribir Sin Saltar "Introduce una subcadena:";
	Leer subcad;
	Si Subcadena (cad,0,Longitud(subcad)-1)=subcad Entonces
		Escribir "La cadena comienza por la subcadena";
	SiNo
		Escribir "La cadena NO comienza por la subcadena";
	FinSi
FinProceso
```

##### Ejercicio6 (Caracteres)

```
Proceso CadenaInvertida
	Definir cad,invertida Como Caracter;
	Definir car como Entero;
	invertida<-"";
	Escribir Sin Saltar "Introduce una cadena:";
	Leer cad;

	Para car<-Longitud(cad)-1 hasta 0 Con Paso -1 Hacer
		invertida<-concatenar(invertida,Subcadena(cad,car,car));
	FinPara
	Escribir "La cadena invertida es:",invertida;
FinProceso
```

#### Pseudocodigo: Arreglos (Arrays).

En este apartado se **explica** como se trabaja con arrays (*Vectores y Matrices*), y como se definen.

##### Ejercicio3

```
Proceso VectorNotas
	Definir notas Como Entero;
	Dimension notas[5];
	Definir tam_notas como Entero;
	Definir nota_media Como Real;
	Definir suma,nota_max,nota_min como Entero;
	Definir indice Como Entero;
	
	tam_notas<-5;
	Para indice<-0 hasta tam_notas-1 hacer
		Repetir
			Escribir sin saltar "Introduce la nota ",indice+1,": ";
			Leer notas[indice];
		Hasta Que notas[indice]>=0 Y notas[indice]<=10;
	FinPara

	nota_max<-notas[0];
	nota_min<-notas[0];
	
	suma<-0;
	Para indice<-0 hasta tam_notas-1 hacer
		suma<-suma+notas[indice];
		Si notas[indice]>nota_max Entonces
			nota_max<-notas[indice];
		FinSi
		Si notas[indice]<nota_min Entonces
			nota_min<-notas[indice];
		FinSi
	FinPara

	nota_media<-suma/tam_notas;
	Escribir "";
	Escribir sin Saltar "Notas:";
	Para indice<-0 hasta tam_notas-1 hacer
		Escribir sin Saltar notas[indice]," ";
	FinPara
	Escribir "";
	Escribir "Nota media: ",nota_media;
	Escribir "Nota máxima: ",nota_max;
	Escribir "Nota mínima: ",nota_min;
FinProceso
```

##### Ejercicio4

```
Proceso VectorPositivo
	Definir vector Como Entero;
	Dimension vector[10];
	Definir tam_vector,indice,num como Entero;
	indice<-0;
	tam_vector<-10;

	Repetir
		Escribir Sin Saltar "Introduce un número en el vector. Número ",indice+1;
		Leer vector[indice];
		indice<-indice+1;
	Hasta Que indice=tam_vector O vector[indice-1]<0;

	indice<-0;
	Escribir "Elementos del vector";

	Mientras indice<tam_vector-1 Y vector[indice]>=0 Hacer
		Escribir sin saltar vector[indice]," ";
		indice<-indice+1;
	FinMientras

FinProceso
```

##### Ejercicio5

```
Proceso OrdenarVector
	Definir vector Como Entero;
	Dimension vector[10];
	Definir cambios,aux Como Entero;
	Definir indice Como Entero;
	Definir tam_vector Como Entero;
	tam_vector<-10;

	Para indice<-0 hasta tam_vector-1 hacer
		vector[indice]<-aleatorio(1,10);
	FinPara

	Repetir 
		cambios<-0;

		Para indice<-0 hasta tam_vector-2 Hacer
			Si vector[indice]>vector[indice+1] Entonces
				aux<-vector[indice];
				vector[indice]<-vector[indice+1];
				vector[indice+1]<-aux;
				cambios<-cambios+1;
			FinSi
		FinPara

	Hasta Que cambios=0;

	Para indice<-0 hasta tam_vector-1 Hacer
		Escribir Sin Saltar vector[indice]," ";
	FinPara
FinProceso
```

##### Ejercicio8

```
Proceso Temperaturas
	Definir temperatura Como Real;
	Dimension temperatura[5,2];
	Definir existe_temperatura Como Logico;
	Definir indice,cant_dias como Entero;
	Definir temp_max, temp_min como Entero;
	cant_dias<-5;

	Para indice<-0 Hasta cant_dias-1 Hacer
		Escribir Sin Saltar "Día ",(indice+1),". Temperatura mínima:";
		Leer temperatura[indice,0];
		Escribir Sin Saltar "Día ",(indice+1),". Temperatura máxima:";
		Leer temperatura[indice,1];
	FinPara

	Escribir "Temperaturas medias";
	Escribir "===================";

	Para indice<-0 Hasta cant_dias-1 Hacer
		Escribir "Día ",(indice+1),". Temperatura media:",(temperatura[indice,0]+temperatura[indice,1])/2;
	FinPara

	temp_min<-temperatura[0,0];

	Para indice<-0 Hasta cant_dias-1 Hacer
		Si temperatura[indice,0]<temp_min Entonces
			temp_min<-temperatura[indice,0];
		FinSi
	FinPara

	Escribir "Días con menos temperatura";
	Escribir "==========================";

	Para indice<-0 Hasta cant_dias-1 Hacer
		Si temperatura[indice,0]=temp_min Entonces
			Escribir "Día ",(indice+1);
		FinSi
	FinPara

	existe_temperatura<-Falso;
	Escribir "Días con temperatura máxima";
	Escribir "===========================";
	Escribir sin saltar "Introduce una temperatura:";
	Leer temp_max;

	Para indice<-0 Hasta cant_dias-1 Hacer
		Si temperatura[indice,1]=temp_max Entonces
			Escribir "Día ",(indice+1);
			existe_temperatura<-Verdadero;
		FinSi
	FinPara

	Si no existe_temperatura Entonces
		Escribir "No hay ningún día con dicha temperatura.";
	FinSi

FinProceso
```

##### Ejercicio10

```
Proceso Tabla
	Definir matriz Como Entero;
	Dimension matriz[5,5];
	Definir fila,col como Entero;
	Definir num_filas, num_cols Como Entero;
	Definir suma como Entero;
	num_filas<-5;
	num_cols<-5;

	Para fila<-0 hasta num_filas-1 Hacer
		Para col<-0 hasta num_cols-1 Hacer
			Escribir Sin Saltar "Introduce el número de la fila ",fila+1," y columna ",col+1,":";
			Leer matriz[fila,col];
		FinPara
	FinPara

	Para fila<-0 hasta num_filas-1 Hacer
		suma<-0;
		Para col<-0 hasta num_cols-1 Hacer
			suma<-suma+ matriz[fila,col];
		FinPara
		Escribir "La suma de los elemento de la fila ",fila+1," es ",suma;
	FinPara

	Para col<-0 hasta num_cols-1 Hacer
		suma<-0;
		Para fila<-0 hasta num_filas-1 Hacer
			suma<-suma+ matriz[fila,col];
		FinPara
		Escribir "La suma de los elemento de la columna ",col+1," es ",suma;
	FinPara
FinProceso	
```

#### Pseudocodigo: Progrmacion Estructurada.

En este apartado **explica** como se definen y como funcionan las **funciones** (*Devuelven un valor*), los **Procedimientos** (*no devuelven nada*) y **las funciones recursivas** (*Se llaman unas a otras*).

##### Ejercicio3

```
Funcion tmedia <- calcularTemperaturaMedia(temp1,temp2)
	Definir tmedia Como Real;
	tmedia<-(temp1+temp2)/2;
FinFuncion



Proceso TemperturaMedia
	Definir tmin,tmax Como Real;
	Definir cantidad,indice como Entero;
	Escribir Sin Saltar "¿Cuántas temperaturas vas a calcular?:";
	Leer cantidad;
	Para indice<-1 hasta cantidad Hacer
		Escribir sin saltar "Introduce temperatura mínima:";
		Leer tmin;
		Escribir sin saltar "Introduce temperatura máxima:";
		Leer tmax;
		Escribir "Temperatura media: ",calcularTemperaturaMedia(tmin,tmax);
	FinPara
FinProceso
```

## 18/04/2020

##### Ejercicio5

```
Funcion CalcularMaxMin(vector,size,max Por Referencia,min Por Referencia)
	Definir i como Entero;
	max<-vector[0];
	min<-vector[0];
	Para i<-0 hasta size-1 Hacer
		Si max<vector[i] Entonces
			max<-vector[i];
		FinSi
		Si min>vector[i] Entonces
			min<-vector[i];
		FinSi
	FinPara
FinFuncion


Proceso MaxMin
	Definir lista Como Entero;
	Dimension lista[10];
	Definir size_lista,i Como Entero;
	Definir vmax,vmin como Entero;
	size_lista<-10;

	Para i<-0 hasta size_lista-1 Hacer
		lista[i]<-Aleatorio(1,100);
	FinPara

	CalcularMaxMin(lista,size_lista,vmax,vmin);
	Escribir "El valor máximo es ",vmax;
	Escribir "El valor mínimo es ",vmin;
FinProceso
```

##### Ejercicio7

```
Funcion eslogin<-Login(nombre,pass,intentos por referencia)
	Definir eslogin Como Logico;
	Si nombre="usuario1" Y pass="asdasd" Entonces
		eslogin<-Verdadero;
	SiNo
		eslogin<-Falso;
		intentos<-intentos+1;
	FinSi
FinFuncion

Proceso EntrarEnElSistema
	Definir usuario,clave Como Caracter;
	Definir cuantasveces como entero;
	Definir entrar como Logico;
	cuantasveces<-0;
	Repetir
		Escribir Sin Saltar "Usuario:";
		Leer usuario;
		Escribir Sin Saltar "Password:";
		Leer clave;
		entrar<-Login(usuario,clave,cuantasveces);

		Si no entrar Entonces
			Escribir "Error. Nombre de usuario o contraseña incorrecta.";
		FinSi

	Hasta Que  entrar o cuantasveces=3;

	Si entrar Entonces
		Escribir "Bienvenidos al sistema";
	SiNo 
		Escribir "No has entrado en el sistema";
	FinSi

FinProceso
```

##### Ejercicio11

```
Funcion bisiesto <- EsBisiesto(year)
	Definir bisiesto como Logico;
	Si (year % 4 = 0 Y NO (year % 100 = 0)) O year % 400 = 0 Entonces
		bisiesto <- Verdadero;
	SiNo
		bisiesto <- Falso;
	FinSi
FinFuncion



Funcion dias <- DiasDelMes(month,year)
	Definir dias Como Entero;
	Segun month Hacer
		1,3,5,7,8,10,12:
			dias<-31;
		4,6,9,11:
			dias<-30;
		2: //El mes de febrero depende de si el año es bisiesto
			Si EsBisiesto(year) Entonces
				dias<-29;
			SiNo
				dias<-28;
			FinSi
	FinSegun
FinFuncion



Funcion diaj <- Calcular_Dia_Juliano(day,month,year)
	Definir mes como Entero;
	definir diaj como Entero;
	diaj<-0;
	Para mes<-1 hasta month-1 Hacer
		diaj<-diaj + DiasDelMes(mes,year);
	FinPara
	diaj <- diaj + day;
FinFuncion



Funcion LeerFecha(day Por Referencia,month Por Referencia, year Por Referencia)
	Escribir Sin Saltar "Día:";
	Leer day;
	Escribir Sin Saltar "Mes:";
	Leer month;
	Escribir Sin Saltar "Año:";
	Leer year;
FinFuncion




Proceso DiaJuliano
	Definir d,m,a como Entero;
	LeerFecha(d,m,a);
	Escribir "Día Juliano: ",Calcular_Dia_Juliano(d,m,a);
FinProceso

```

#### Lenguajes de Programacion

En este apartado no hablas un poco de los diferentes lenguajes de programacion existentes, como son: 

* C++
* Python
* Java
* etc...

Tambien mencionan el ensanblador y como antiguamente los programadores trabajon unicamente con 0 y 1, como funcionan los lenguajes de alto nivel, el compilador, el interprete etc...

## Realizacion del examen: Introduccion a la Progrmación.

Se ha **aprobado** con exito, he fallado 2 o 3 preguntas por no entender bien lo que se pregunta y otra por **polas**



