from Ataque import *

class RayoVeloz(Ataque):
        
        def __init__(self, valor, nombre, valorExtra):
            Ataque.__init__(self, valor, nombre, valorExtra)
        
        def atacar(self, chipo, valor):
            chipo.recibirDanio(valor)