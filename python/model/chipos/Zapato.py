from model.ataque.Zapatazo import Zapatazo
from model.chipos.Chipokomon import Chipokomon

class Zapato(Chipokomon):
    def __init__(self, nombre, nivel, tipo):
        Chipokomon.__init__(self,nombre, nivel, 30,[Zapatazo()], tipo)

    def __str__(self):
        return 'Zapato'