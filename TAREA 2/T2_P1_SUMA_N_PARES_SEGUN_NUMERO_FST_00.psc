Funcion resultado <- suma ( a,b )
	resultado=a+b
Fin Funcion

Algoritmo SUMA_N_PARES_SEGUN_NUMERO
	Imprimir "Ingrese el numero: "
	Leer n
	Si n mod 2 = 0
		Imprimir "El numero es par"
		n=n
		k=0
		f=0
		Para i=1 Hasta n Con Paso 1 Hacer
			resultado=suma(n,k)
			total=suma(resultado,f)
			imprimir resultado
			k=i*2
			f=total
		Fin Para
		imprimir "El resultado del análisis es: ",total	
	SiNo
		Imprimir "El numero es impar"
		n=n+1
		k=0
		f=0
		Para i=1 Hasta n-1 Con Paso 1 Hacer
			resultado=suma(n,k)
			total=suma(resultado,f)
			imprimir resultado
			k=i*2
			f=total
		Fin Para
		imprimir "El resultado del análisis es: ",total	
	FinSi
	
FinAlgoritmo
