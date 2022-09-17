from random import randint

from model.logger.logger import Logger

class Batalla():
    def __init__(self, chipo1, chipo2): 
        self._chipo1 = None
        self._chipo2 = None
        self.set_turnos(chipo1, chipo2)
        chipo1.oponente = chipo2
        chipo2.oponente = chipo1
    
    @property
    def chipo1(self):
        return self._chipo1
    
    @chipo1.setter
    def chipo1(self, chipo):
        self._chipo1 = chipo
    
    @property
    def chipo2(self):
        return self._chipo2
    
    @chipo2.setter
    def chipo2(self, chipo):
        self._chipo2 = chipo
    
    def set_turnos(self, chipo1, chipo2):
        random = randint(1,2)
        if(random == 1):
            self.chipo1 = chipo1
            self.chipo2 = chipo2
        else:
            self.chipo2 = chipo1
            self.chipo1 = chipo2
    
    def comenzar_batalla(self):
        while(self.sigue_alguno_con_vida()):
            self.chipo1.atacar(self.chipo2)
            self.chipo2.atacar(self.chipo1)
            self.verificar_muertos()
        self.print_ganador()

    def sigue_alguno_con_vida(self):
        return not(self.chipo1.esta_muerto() or self.chipo2.esta_muerto())
    
    def print_ganador(self):
        if(self.chipo1.esta_muerto()):
            Logger.instance().info(str(self.chipo2) + ' Es el ganador')
        else:
            Logger.instance().info(str(self.chipo1) + ' Es el ganador')

    def verificar_muertos(self):
        if(self.chipo1.esta_muerto()):
           Logger.instance().info(str(self.chipo1) + ' se murio')
        elif(self.chipo2.esta_muerto()):
            Logger.instance().info(str(self.chipo2) + ' se murio')
        else:
            Logger.instance().info('La batalla entre ' + str(self.chipo1) + ' y ' + str(self.chipo2) + ' continua')
            
