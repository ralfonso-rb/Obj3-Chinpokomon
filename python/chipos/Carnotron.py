from python.Ataque.CanionConico import CanionConico
from python.Ataque.RayoVeloz import RayoVeloz
from python.chipos.Chipokomon import Chipokomon


class Carnotron(Chipokomon):
    def __init__(self, nombre, nivel, vida, tipo):
        super().__init__(nombre, nivel, vida, tipo)
        self._ataques = [RayoVeloz, CanionConico]

    def __str__(self):
        return 'Carnotron'



