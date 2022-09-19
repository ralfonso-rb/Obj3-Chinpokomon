from model.logger.logger import Logger
from model.logger.nivel import Nivel
from model.chipos.Zapato import Zapato
from model.chipos.enums import TiposDeChipos
from model.batalla.batalla import Batalla
from model.referi.referi import Referi
from model.ataque.PomadaWassington import PomadaWassington

Logger.instance(Nivel.INFO)
zapato1 = Zapato("Zapato 1", 6, TiposDeChipos.ROBOT)
zapato2 = Zapato("Zapato 2", 5, TiposDeChipos.ANIMAL)
zapato2.agregarAtaque(PomadaWassington())
batalla = Batalla(zapato1, zapato2)
referi = Referi(batalla)
referi.gestionar_batalla()
