from Ataque import *

class PomadaWassington(Ataque):
        
        def __init__(self, valor, nombre, valorExtra):
            Ataque.__init__(self, valor, nombre, valorExtra)
        
        def atacar(self, chipo, valor):
            chipo.getOponente().agregarVida(valor)