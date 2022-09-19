from random import randint
from model.ataque.Ataque import Ataque

class Zapatazo (Ataque):
        
        def __init__(self):
            Ataque.__init__(self, 1, "Zapatazo", 3)
        
        def atacar_con_valor(self, chipo, valor):
            random = randint(1, 2)
            if(random == 1):
                chipo.recibir_danio(valor * 2)
            else:
                chipo.recibir_danio(valor)