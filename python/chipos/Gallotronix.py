from python.Ataque.GarraMecanica import GarraMecanica
from python.chipos.Chipokomon import Chipokomon


class Gallotronix(Chipokomon):
    def __init__(self, nombre, nivel, vida, tipo):
        super().__init__(nombre, nivel, vida, tipo)
        self._ataques = [GarraMecanica]

    def __str__(self):
        return 'Gallotronix'
