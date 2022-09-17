from model.ataque.Ataque import Ataque

class CanionConico(Ataque):
    
    def __init__(self):
        Ataque.__init__(self, 4, "Canion Conico", 1)

    def atacar_con_valor(self, chipo, valor): 
        chipo.recibir_danio(valor)