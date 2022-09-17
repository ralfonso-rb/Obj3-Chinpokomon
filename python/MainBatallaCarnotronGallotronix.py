from model.logger.logger import Logger
from model.logger.nivel import Nivel
from model.chipos.Carnotron import Carnotron
from model.chipos.Gallotronix import Gallotronix
from model.chipos.enums import TiposDeChipos
from model.batalla.batalla import Batalla
from model.referi.referi import Referi


logger = Logger(Nivel.INFO)
gallotronix = Gallotronix("Gallotronix", 5, TiposDeChipos.ROBOT)
carnotron = Carnotron("Carnotron", 6, TiposDeChipos.ANIMAL)
batalla = Batalla(carnotron, gallotronix)
referi = Referi(batalla)
referi.gestionar_batalla()
