from model.ataque.CanionConico import CanionConico
from model.ataque.RayoVeloz import RayoVeloz
from model.chipos.Chipokomon import Chipokomon


class Carnotron(Chipokomon):
    def __init__(self, nombre, nivel, tipo):
        Chipokomon.__init__(self, nombre, nivel, 20,[RayoVeloz, CanionConico], tipo)

    def __str__(self):
        return 'Carnotron'



