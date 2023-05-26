# TALLER 4 - Ejercicio de caso práctico de modelamiento de objetos

## INTRODUCCION

Este proyecto tiene como finalidad cumplir con los requisitos mínimos exigidos para la entrega del cuarto taller (Ejercicios de POO y modelamiento de objetos). Para tal fin, se realiza un proceso de análisis de la información con el objetivo de extraer datos relevantes que permitan dar solución a cada uno de los ejercicios planteados a continuación:

1. Desarrolle una clase en Java que realice la abstracción de un sistema planetario, debiendo tener en cuenta para cada cuerpo del sistema aspectos como: masa, densidad, diámetro, distancia al sol (suponga órbitas circulares), un número de identificador único y un nombre textual. Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos cualesquiera del sistema.

2. ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?

3. Escriba un programa en java que genere aleatoriamente (Ayuda: Vea la clase Math para saber cómo generar números aleatorios en java) un array de números reales, y lo ordene mediante el algoritmo de la burbuja o mediante quick sort (esto deberá poder elegirlo el usuario).

4. Se quiere implementar el control de un Ferry. Para ello cree una clase Vehículo. Incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia o ausencia de tripulación, número de ruedas, fecha de matriculación, medio por el que se desplaza, etc. Incluya los métodos que considere oportunos. Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.

5. A partir de la clase anterior, y mediante herencia cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un camión, una bicicleta, una lancha. Incluya en cada clase algún atributo específico que la diferencie de las demás. Por ejemplo, para el coche un booleano que determine si es de tres o cinco puertas, para el camión la altura (indiferente en los otros vehículos), etc. Realice un programa como el del ejercicio anterior capaz de trabajar con los distintos tipos de vehículos.

6. Una interesante clase predefinida en el lenguaje java es la clase Vector, que implemente la abstracción "array dinámico". Revise la clase y úsela (en ficheros diferentes) para realizar un programa que lea números del teclado hasta que se introduce dos veces seguidas el mismo número. Entonces el programa muestra todos los números introducidos y termina.

## DESCRIPCION

Se llevó a cabo un proceso de abstracción por medio del cual se dio solución a cada una de las problemáticas planteadas en cada ejercicio. 

Adicionalmente se construyó una clase main general desde la cual se puede ejecutar la funcionalidad de cualquiera de los ejercicios. 

En la documentación de cada ejercicio se describe claramente cuál es su finalidad y su funcionalidad.


### Estructura del proyecto
- sofka.exercise
	1. exercise1
		- Planet (clase)
		- PlanetarySystem (clase)
	2. exercise2
		- Addition (clase)
	3. exercise3
		- SortBy (clase)
	4. exercise4
		- Vehicle (clase)
		- VehicleWarehouse (clase)
		- Ferry (clase)
	5. exercise5
		- Bicycle (clase)
		- Boat (clase)
		- Car (clase)
		- Motorcycle (clase)
		- Truck (clase)
	6. exercise6
		- ReadNumbers (clase)
	7. exerciseApplication
		- Main (Clase Main)


## TEMAS

En el presente proyecto se elaboraron 14 clases de la cuales 1 es abstracta. En estas se abordan algunos temas de la programación orientada a objetos, tales como:

- Clases.
- Objetos.
- Atributos.
- Métodos.
- Modificadores de acceso.
- Método constructor.
- Abstracciones.
- Polimorfismo.
- Manejo de excepciones (try-catch).
- Documentación.
- Buenas prácticas de programación.
- Sobrecarga de metodo main, etc...
