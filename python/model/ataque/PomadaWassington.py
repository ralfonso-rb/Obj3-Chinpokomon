from model.ataque.Ataque import Ataque

class PomadaWassington(Ataque):
        
        def __init__(self, valor, nombre, valor_extra):
            Ataque.__init__(self, valor, nombre, valor_extra)
        
        def atacar(self, chipo, valor):
            chipo.oponente.agregar_vida(valor)