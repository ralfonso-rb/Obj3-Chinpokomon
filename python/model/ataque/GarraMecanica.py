from model.ataque.Ataque import Ataque
from random import randint

class GarraMecanica(Ataque):
        
        def __init__(self):
            Ataque.__init__(self, 2, "Garra Mecanica", 2)
    
        def atacar_con_valor(self, chipo, valor): 
            random = randint(1, 10)  
            if(random == 1):
                chipo.recibir_danio(chipo.vida / 2)
            else:
                chipo.recibir_danio(valor)