import random


class Batalla():
    def __init__(self, chipo1, chipo2): 
        self._chipo1 = chipo1
        self._chipo2 = chipo2
        self.setTurnos(chipo1, chipo2)
        chipo1.setOponente(chipo2)
        chipo2.setOponente(chipo1)
    
    @property
    def chipo1(self):
        return self._chipo1
    
    @chipo1.setter
    def chipo1(self, chipo1):
        self._chipo1 = chipo1
    
    @property
    def chipo2(self):
        return self._chipo2
    
    @chipo2.setter
    def chipo2(self, chipo2):
        self._chipo2 = chipo2
    
    def setTurnos(self, chipo1, chipo2):
        random = random.randint(2 + 1) + 1
        if(random == 1):
            chipo1 = chipo1
            chipo2 = chipo2
        else:
            chipo2 = chipo1
            chipo1 = chipo2
    
    def comenzarBatalla(self):
        while(self.sigueAlgunoConVida(self.chipo1, self.chipo2)):
            self.chipo1.atacar(self.chipo2)
            self.chipo2.atacar(self.chipo1)
            self.verificarMuertos()
        self.printGanador()

    def sigueAlgunoConVida(self):
        return not(self.chipo1.estaMuerto() or self.chipo2.estaMuerto())
    
    def printGanador(self):
        if(self.chipo1.estaMuerto()):
            return { str(self.chipo2) + 'Gano el chipo 2'}
        else:
            return { str(self.chipo1) + 'Gano el chipo 1'}

    def verificarMuertos(self):
        if(self.chipo1.estaMuerto()):
           return { str(self.chipo1) + ' se murio'}
        elif(self.chipo2.estaMuerto()):
            return { str(self.chipo2) + ' se murio'}
        else:
            return { 'LA BATALLA SIGUE'}
            
