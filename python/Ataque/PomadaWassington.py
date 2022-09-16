from Ataque import *

class PomadaWassington(Ataque):
        
        def __init__(self, valor, nombre, valor_extra):
            Ataque.__init__(self, valor, nombre, valor_extra)
        
        def atacar(self, chipo, valor):
            chipo.get_oponente().agregar_vida(valor)