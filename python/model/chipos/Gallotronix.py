from model.ataque.GarraMecanica import GarraMecanica
from model.chipos.Chipokomon import Chipokomon


class Gallotronix(Chipokomon):
    def __init__(self, nombre, nivel, tipo):
        Chipokomon.__init__(self, nombre, nivel, 25, [GarraMecanica()], tipo)
        
    def __str__(self):
        return 'Gallotronix'
