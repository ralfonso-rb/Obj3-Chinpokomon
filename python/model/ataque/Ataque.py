from abc import ABC, abstractmethod

class Ataque():
    def __init__(self, valor, nombre, valor_extra):
        self._valor = valor
        self._nombre = nombre
        self._valor_extra = valor_extra

    @property
    def nombre(self):
      return self._nombre
    
    @property
    def valor(self):
      return self._valor

    @valor.setter
    def valor(self, valor):
        self._valor = valor
    
    @property
    def valor_extra(self):
        return self._valor_extra
    
    @valor_extra.setter
    def valor_extra(self, valor_extra):
        self.valor_extra = valor_extra

    @nombre.setter
    def nombre(self, nombre):
        self.nombre = nombre
    
    def atacar(self, chipo):
        if(chipo.oponente.tiene_ventaja_sobre(chipo)):
            self.atacar_con_valor(chipo, self.valor + self.valor_extra)
        else:
            self.atacar_con_valor(chipo, self.valor)
    
    @abstractmethod
    def atacar_con_valor(self, chipo, valor):
        pass

    def __str__(self):
        self.nombre
    
    