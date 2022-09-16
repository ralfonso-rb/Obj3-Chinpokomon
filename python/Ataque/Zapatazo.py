from random import random
from Ataque import *

class Zapatazo (Ataque):
        
        def __init__(self, valor, nombre, valor_extra):
            Ataque.__init__(self, valor, nombre, valor_extra)
        
        def atacar(self, chipo, valor):
            random = random.randint(2, 1)
            if(random == 1):
                chipo.recibir_danio(valor * 2)
            else:
                chipo.recibir_danio(valor)