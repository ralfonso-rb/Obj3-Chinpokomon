from model.ataque.Ataque import Ataque

class PomadaWassington(Ataque):
        
        def __init__(self):
            Ataque.__init__(self, 5, "Pomada Wassington", 1)
        
        def atacar_con_valor(self, chipo, valor):
            chipo.oponente.agregar_vida(valor)