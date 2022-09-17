from random import randint

class Batalla():
    def __init__(self, chipo1, chipo2): 
        self._chipo1 = chipo1
        self._chipo2 = chipo2
        # self.set_turnos(chipo1, chipo2)
        # chipo1.oponente(chipo2)
        # chipo2.oponente(chipo1)
    
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
    
    def set_turnos(self, chipo1, chipo2):
        random = randint(1,2)
        if(random == 1):
            self.chipo1(chipo1)
            self.chipo2(chipo2)
        else:
            self.chipo2(chipo1)
            self.chipo1(chipo2)
    
    def comenzar_batalla(self):
        self.set_turnos(self.chipo1, self.chipo2)
        self.chipo1.oponente(self.chipo2)
        self.chipo2.oponente(self.chipo1)
        while(self.sigue_alguno_con_vida(self.chipo1, self.chipo2)):
            self.chipo1.atacar(self.chipo2)
            self.chipo2.atacar(self.chipo1)
            self.verificar_muertos()
        self.print_ganador()

    def sigue_alguno_con_vida(self):
        return not(self.chipo1.esta_muerto() or self.chipo2.esta_muerto())
    
    def print_ganador(self):
        if(self.chipo1.esta_muerto()):
            return { str(self.chipo2) + 'Gano el chipo 2'}
        else:
            return { str(self.chipo1) + 'Gano el chipo 1'}

    def verificar_muertos(self):
        if(self.chipo1.esta_muerto()):
           return { str(self.chipo1) + ' se murio'}
        elif(self.chipo2.esta_muerto()):
            return { str(self.chipo2) + ' se murio'}
        else:
            return { 'LA BATALLA SIGUE'}
            
