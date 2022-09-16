from Ataque import *

class CanionConico(Ataque):
    
    def __init__(self, valor, nombre, valor_extra):
        Ataque.__init__(self, valor, nombre, valor_extra)

    def atacar(self, chipo): 
        chipo.recibir_danio(self.valor)