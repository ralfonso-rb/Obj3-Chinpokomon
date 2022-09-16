from Ataque import *

class CanionConico(Ataque):
    
    def __init__(self, valor, nombre, valorExtra):
        Ataque.__init__(self, valor, nombre, valorExtra)

    def atacar(self, chipo): 
        chipo.recibirDanio(self.getValor())