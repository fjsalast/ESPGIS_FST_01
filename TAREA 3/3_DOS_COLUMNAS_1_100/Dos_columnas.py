# Programa que imprime dos columnas:
# Columna 1: números del 1 al 100
# Columna 2: números del 100 al 1

for i in range(1, 101):          # i recorre del 1 al 100
    j = 101 - i                  # j es el número inverso (100 a 1)
    print(i, "\t", j)            # Imprime en dos columnas separadas por una tabulación
