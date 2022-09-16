from Ataque import *
import random

class GarraMecanica(Ataque):
        
        def __init__(self, valor, nombre, valor_extra):
            Ataque.__init__(self, valor, nombre, valor_extra)
    
        def atacar(self, chipo, valor): 
            random = random.randint(10, 1)  
            if(random == 1):
                chipo.recibir_danio(chipo.get_vida() / 2)
            else:
                chipo.recibir_danio(valor)