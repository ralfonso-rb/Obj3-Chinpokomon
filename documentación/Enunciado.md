### TP 1
# Chinpokomon

### Enunciado:

Queremos diseñar un videojuego de "Chinpokomon", donde diversas criaturas se
enfrentan entre sí en feroces batallas.

Cada chinpokomon tiene un nombre, un nivel de vida (un número) y una serie de
ataques que sabe infligir contra su rival. Cuando ponemos un chinpokomon a
pelear contra otro, estos se atacan entre sí, por turnos, atacando una vez cada
uno. Para atacar utilizarán uno de los araques que tiene disponibles de forma
aleatoria.

El que lleva primero la vida de su rival a cero es el vencedor.

Queremos modelar 3 chinpokomons y sus ataques:

* Carnotron (tiene 20 de vida, dos ataques, "rayo veloz" que inflige 3 puntos de
  daño, y "cañón sónico" que infringe 4 de daño)
* Gallotronix (tiene 25 de vida y un ataque "garra mecánica", que hace 2 de
  daño)
* Zapato (tiene 30 de vida y un ataque "zapatazo" que realiza 1 punto de daño)

##### Punto 1:
En nuestra primera implementación queremos crear la clase `Chinpokomon`, crear
los chinpokomons mencionados en un main, y poner a pelear a "Carnotron" contra
"Zapato". Para pelear, se pide considere que haya alguna entidad encargada de
gestionar las batallas, cuyo comportamiento sea hacer que ambos peleen y que
devuelva el ganador. El objetivo entonces es en un main poder hacer batallar dos
e imprimir el nombre del ganador.

##### Punto 2:
Queremos poder loggear la información de la batalla (ej. que vida tiene cada uno
a un momento, quien atacó a quien, cuanto daño le hizo, etc.). Para ello vamos a
crear un logger. Un logger tiene que poder ser instanciado con un "nivel"
específico, que puede ser DEBUG, INFO, WARN o ERROR, y se debe poder cambiar su
nivel en runtime con `setLevel`. Si se configura en nivel "DEBUG", entonces
todos los mensajes se imprimen siempre, si se configura como "INFO" se imprimen
todos los mensajes que no sean debug, si es "WARN", todos menos debug e info, y
si es "ERROR" entonces solo los mensajes de error. Así, el logger debe entender
los mensajes `debug`, `info`, `warn` y `error` que esperan un string, e imprimen
el mismo en pantalla si el nivel del logger coincide con el mensaje o es uno
inferior. Por ej. si se llama a `info` en un logger con nivel "DEBUG" se debe
imprimir el mensaje en pantalla, pero si el nivel es "WARN" entonces no se
imprime nada.

El logger debe ser siempre el mismo, y debe poder accederse desde distintos
lugares del código.

##### Punto 3:
Ahora, algunos ataques son más veloces que otros. Por ejemplo, "zapatazo" tiene
un 50% de probabilidades de golpear al enemigo 2 veces (y no solo una) en cada
ataque que realiza. Por su lado, "garra mecánica" debería propinar un golpe
crítico con un 10% de probabilidad, sacando al enemigo la mitad de la vida que
le queda disponible.

Modifique el código para que estos ataques tengan dicho comportamiento.

##### Punto 4:
Queremos crear 2 zapatos, y hacerlos pelear. El primer Zapato solo conoce
"zapatazo", como se mencionó antes, pero el segundo conoce "zapatazo" y "Pomada
Wassington", un ataque que le recupera 5 puntos de vida a sí mismo, en lugar de
dañar al oponente.

##### Punto 5:
Los chinpokomon pueden categorizarse segun su naturaleza. Hay chinpokomon que
son Animales, otros que son Robots, y otros que son Cosas. La naturaleza de un
chinpokomon es de vital importancia en la batalla, ya que algunas naturalezas
tienen ventaja contra otra. Por ejemplo, los chinpokomon con naturaleza Robot
tienen ventaja contra los chinpokomon Animales. Cuando un chinpokomon tiene
ventaja contra otro, sus ataques son más efectivos, inflingiendo más puntos de
daño que los que haría en caso de no tener ventaja. Cada ataque tiene entonces
un "booster por ventaja", que se aplica para los golpes normales (ej. no
critico) que se realizan cuando hay ventaja:

* Rayo velóz y Cañon Sónico hacen un punto más de daño
* Garra Mecánica hace 2 puntos más de daño
* Zapatazo hace 3 puntos más de daño
* Pomada Wassinton recupera 1 punto más de vida.

Agregue esta funcionalidad al problema teniendo en cuenta los siguientes
esquemas de ventaja y desventaja:

* Robot tiene ventaja contra Animal
* Animal tiene ventaja contra Cosa
* Cosa tiene ventaja contra Robot

### Sobre lo que debe realizar

La metodología de trabajo a realizar para el TP es la siguiente:

* Debe crearse un repositorio en GitHub donde esté como owner el docente, y
  todos los miembros del grupo.
* Se deben crear issues para cada tarea a realizar en el TP (no hacen falta
  issues super finos, pero si al menos dividir las grandes tareas facilmente
  identificables).
* Cada miembro del grupo debe tomar uno o más issues, y solucionarlos. El
  trabajo se realiza entonces en parte de forma individual. Sin embargo, previo a
  encarar una solución, el equipo debe charlar y estar de acuerdo en la
  arquitectura general de la solución, por lo que es importante que todos sepan
  cómo se va a solucionar el problema en general, aunque sea uno en concreto el
  que lo codee.
* En el repositorio se van a crear:
    * una rama "main" que va a tener el código entregado al docente. Lo que va
      ahí, es entregado.
    * una rama "dev" que va a tener el código principal en el que todos los
      estudiantes se han puesto de acuerdo y donde confluyen las soluciones de
      todos.
    * Luego se crean ramas para cada issue que se va a solucionar.
* Cada estudiante deberá entonces crear una rama que sale desde "dev" para el
  issue que va a solucionar. Soluciona el issue, y manda pull-request a "dev".
  Cuando todos los estudian y aprueban, se mergea a "dev". Tras verificar que
  "dev" está andando, pueden mandar pull-request a main para entregar esa
  funcionalidad ya hecha.
* En el caso de que haya cosas para mejorar, el docente puede mandar comentarios
  en el pull-request, sugieriendo cambios o mejoras a plantear en las próximas
  iteraciones.
* Las ramas temporales de los issues se borran una vez el issue se terminó y se
  mergeo con "dev".

Sobre lo que hay que hacer efectivamente:

1. Se espera realice todos los puntos, del 1 al 5, implementando en Java. Tenga
   en consideración:
    * Diseñar un modelo escalable que permita en el futuro agregar facilmente
      nuevos chinpokomons. Estos podrían ser de la misma naturaleza ya descrita o
      de una nueva. Además podrían aparecer nuevos ataques o nuevas formas de
      atacar.
    * Piense en los patrones de diseño que conoce y apliquelos en el problema.
      Pista: hay lugar para varios patrones en este problema.
    * Como norma general, evite tener código de alta complejidad. Ej. más de dos
      niveles de anidamiento ("if dentro de while" va, pero "while dentro de if
      dentro de while" o cualquier otra forma de una cosa dentro de otra 3 veces,
      no). Si tiene código de alta complejidad, piense en dividir en subtareas
      y/o delegar en otros objetos.
2. Arme un breve informe sobre los patrones aplicados en el desarrollo, cuáles y
   donde fueron usados y por qué motivo. Puede agregar información adicional
   sobre su arquitectura, o sobre opciones de diseño descartadas.
3. Siguiendo lo realizado en 1. se pide ahora que realice la implementación en
   Python. No basta con pasar el código tal cual a python, sino que debe hacer
   uso de buenas prácticas de programación en este lenguaje, aprovechando las
   caracteristicas propias del mismo (ej. herencia multiple), properties, formato
   de scripting, etc.
4. Arme un informe sobre los patrones de diseño que aplicó en python, y comente:
   ¿qué patrones quedaron igual? ¿cuáles cambiaron por las diferencias del
   lenguaje?