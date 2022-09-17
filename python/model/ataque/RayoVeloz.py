from model.ataque.Ataque import Ataque

class RayoVeloz(Ataque):
        
        def __init__(self):
            Ataque.__init__(self, 3, "Rayo Veloz", 1)
        
        def atacar_con_valor(self, chipo, valor):
            chipo.recibir_danio(valor)