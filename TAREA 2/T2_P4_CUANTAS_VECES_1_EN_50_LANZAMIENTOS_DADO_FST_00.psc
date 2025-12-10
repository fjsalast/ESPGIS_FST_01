Funcion resultado <- suma ( a,b )
	resultado=a+b
Fin Funcion

Algoritmo CUANTAS_VECES_1_EN_50_LANZAMIENTOS_DADO
	total=0
	q=0
	Para i=1 Hasta 50 Con Paso 1 Hacer
		lanza =Azar(6)+1
		imprimir "Lanzamiento #",i,": ",lanza
		Si lanza=1 Entonces
			total=suma(lanza,q)
			q=total	
		SiNo
		Fin Si
	Fin Para
	imprimir "El numero de veces que cayo #1 es:",q
FinAlgoritmo
