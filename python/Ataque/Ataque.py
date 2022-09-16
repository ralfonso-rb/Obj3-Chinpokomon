from abc import ABC, abstractmethod

class Ataque(object):
    def __init__(self, valor, nombre, valorExtra):
        self.valor = valor
        self.nombre = nombre
        self.valorExtra = valorExtra

    @property
    def nombre(self):
      return self.nombre
    
    @property
    def valor(self):
      return self.valor
    
    @property
    def valorExtra(self):
        return self.valorExtra
    
    @valor.setter
    def valor(self, valor):
        self.valor = valor
    
    @valorExtra.setter
    def valorExtra(self, valorExtra):
        self.valorExtra = valorExtra

    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre
    
    def atacar(self, chipo):
        if(chipo.getOponente().tieneVentajaSobre(chipo)):
            self.atacar(chipo, self.getValor() + self.getValorExtra())
        else:
            self.atacar(chipo, self.getValor())
    
    @abstractmethod
    def atacar(self, chipo, valor):
        pass
    
    