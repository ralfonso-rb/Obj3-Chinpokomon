from Ataque import *
import random

class GarraMecanica(Ataque):
        
        def __init__(self, valor, nombre, valorExtra):
            Ataque.__init__(self, valor, nombre, valorExtra)
    
        def atacar(self, chipo, valor): 
            random = random.randint(10, 1)  
            if(random == 1):
                chipo.recibirDanio(chipo.getVida() / 2)
            else:
                chipo.recibirDanio(valor)