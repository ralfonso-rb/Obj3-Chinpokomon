from python.Ataque.Zapatazo import Zapatazo
from python.chipos.Chipokomon import Chipokomon


class Zapato(Chipokomon):
    def __init__(self, nombre, nivel, vida, tipo):
        super().__init__(nombre, nivel, vida, tipo)
        self._ataques = [Zapatazo]

    def __str__(self):
        return 'Zapato'