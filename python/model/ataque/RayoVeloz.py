from model.ataque.Ataque import Ataque

class RayoVeloz(Ataque):
        
        def __init__(self, valor, nombre, valor_extra):
            Ataque.__init__(self, valor, nombre, valor_extra)
        
        def atacar(self, chipo, valor):
            chipo.recibir_danio(valor)