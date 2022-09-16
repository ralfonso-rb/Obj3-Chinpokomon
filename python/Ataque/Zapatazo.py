from random import random
from Ataque import *

class Zapatazo (Ataque):
        
        def __init__(self, valor, nombre, valorExtra):
            Ataque.__init__(self, valor, nombre, valorExtra)
        
        def atacar(self, chipo, valor):
            random = random.randint(2, 1)
            if(random == 1):
                chipo.recibirDanio(valor * 2)
            else:
                chipo.recibirDanio(valor)