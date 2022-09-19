from model.logger.logger import Logger
from model.logger.nivel import Nivel
from model.chipos.Carnotron import Carnotron
from model.chipos.Zapato import Zapato
from model.chipos.enums import TiposDeChipos
from model.batalla.batalla import Batalla
from model.referi.referi import Referi

Logger.instance(Nivel.INFO)
carnotron = Carnotron("Carnotron", 6, TiposDeChipos.ROBOT)
zapato = Zapato("Zapato", 5, TiposDeChipos.ANIMAL)
batalla = Batalla(carnotron, zapato)
referi = Referi(batalla)
referi.gestionar_batalla()
