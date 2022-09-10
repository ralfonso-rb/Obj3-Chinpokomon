Queremos diseñar un videojuego de model.chimpos.Chinpokomon, donde diversas criaturas se enfrentan entre si en feroces batallas.
Cada chinpokomon tiene un nombre, un nivel de vida (un número) y una serie de ataques que sabe infligir contra su rival.
Cuando ponemos un chinpokomon a pelear contra otro, estos se atacan entre si, por turnos, atacando una vez cada uno con
un ataque de los que tiene disponibles de forma aleatoria. El que lleva la vida de su rival a cero primero,
es el vencedor.
Queremos modelar 3 chinpokomons y sus ataques.
* model.chimpos.Carnotron (tiene 20 de vida, dos ataques, rayo veloz que inflige 3 de daño, y cañón cónico que infringe 4 de daño)
* model.chimpos.Gallotronix (tiene 25 de vida y un ataque garra mecánica, que hace 2 de daño)
* model.chimpos.Zapato (tiene 30 de vida y un ataque zapatazo que realiza 1 punto de daño)

En nuestra primer implementación queremos crear la clase model.chimpos.Chinpokomon, crear los mencionados en un main, y poner
a pelear a model.chimpos.Carnotron contra model.chimpos.Zapato, y que nos diga el nombre del ganador. Luego podemos volver a probar haciendo
pelear a otros dos.

Ahora, algunos ataques son mas veloces que otros. Por ejemplo, zapatazo tiene un 50% de probabilidades de golpear al
enemigo 2 veces, y no solo una, en cada ataque que realiza. Por su lado, garra mecánica debería realizar un golpe
crítico con un 10% de probabilidad, sacando al enemigo la mitad de la vida que le queda disponible.
Modifique el código para que estos ataques tengan dicho comportamiento.

parte3: Queremos crear 2 zapatos, y hacerlos pelear. El primer model.chimpos.Zapato solo conoce zapatazo, como se mencionó antes,
pero el segundo conoce model.ataque.Zapatazo y "Pomada Wassington", un ataque que le recupera 5 puntos de vida a si mismo,
en lugar de dañar al oponente.