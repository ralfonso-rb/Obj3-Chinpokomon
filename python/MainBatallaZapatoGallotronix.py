from model.logger.logger import Logger
from model.logger.nivel import Nivel
from model.chipos.Gallotronix import Gallotronix
from model.chipos.Zapato import Zapato
from model.chipos.enums import TiposDeChipos
from model.batalla.batalla import Batalla
from model.referi.referi import Referi

Logger.instance(Nivel.INFO)
zapato1 = Zapato("Zapato", 6, TiposDeChipos.ROBOT)
gallotronix = Gallotronix("Zapato 2", 5, TiposDeChipos.ANIMAL)
batalla = Batalla(zapato1, gallotronix)
referi = Referi(batalla)
referi.gestionar_batalla()
