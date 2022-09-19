from random import randint
from model.logger.logger import Logger

class Chipokomon(object):
    def __init__(self, nombre, nivel, vida, ataques, tipo):
        self._nombre = nombre
        self._nivel = nivel
        self._vida = vida
        self._ataques = ataques
        self._tipo = tipo
        self._oponente = None

    @property
    def nombre(self):
        return self._nombre
    
    @property
    def nivel(self):
        return self._nivel
    
    @property
    def vida(self):
        return self._vida

    @property
    def ataques(self):
        return self._ataques

    @property
    def tipo(self):
        return self._tipo

    @property
    def oponente(self):
        return self._oponente

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @nivel.setter
    def nivel(self, nivel):
        self._nivel = nivel
    
    @vida.setter
    def vida(self, vida):
        self._vida = vida

    @ataques.setter
    def ataques(self, ataques):
        self._ataques = ataques

    @tipo.setter
    def tipo(self, tipo):
        self._tipo = tipo

    @oponente.setter
    def oponente(self, oponente):
        self._oponente = oponente

    def agregarAtaque(self, ataque):
        self.ataques.append(ataque)

    def tiene_ventaja_sobre(self, chipo):
        return (self.tipo == chipo.tipo.ROBOT and chipo.tipo == chipo.tipo.ANIMAL or
        self.tipo == chipo.tipo.ANIMAL and chipo.tipo == chipo.tipo.COSA or
        self.tipo == chipo.tipo.COSA and chipo.tipo == chipo.tipo.ROBOT)

    def esta_muerto(self):
        return self.vida <= 0

    def recibir_danio(self, danio):
        if(self.vida - danio > 0):
            self.vida = self.vida - danio
        else:
            self.vida = 0
        Logger.instance().info(str(self.nombre) + ' recibio ' + str(danio) + ' de danio')

    def agregar_vida(self, vida):
        self.vida = self.vida + vida
        Logger.instance().info(self.nombre + ' gano ' + str(vida) + ' de vida')

    def atacar(self, chipo):
        random = randint(0, len(self.ataques) - 1)
        if(not chipo.esta_muerto()):
            ataque = self.ataques[random]
            Logger.instance().info(self.nombre + ' ataco a ' + chipo.nombre + ' con ' + str(ataque.nombre))
            ataque.atacar(chipo)
            
