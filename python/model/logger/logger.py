from model.logger.nivel import Nivel

class Logger():

    _instance = None

    def __init__(self):
        raise("Call instance(Nivel value) to create Logger")

    @classmethod
    def instance(cls, nivel=Nivel.INFO):
        if cls._instance is None:
            cls._instance = cls.__new__(cls)
            cls._nivel = nivel
        return cls._instance

    @property
    def nivel(self):
        return self._nivel

    @nivel.setter
    def nivel(self, nivel):
        self._nivel = nivel

    def debug(self, respuesta):
        print("DEBUG: " + respuesta)

    def info(self, respuesta):
        if(self.nivel != Nivel.DEBUG):
            print("INFO: " + respuesta)

    def warn(self, respuesta):
        if( self.nivel != Nivel.DEBUG or self.nivel == Nivel.INFO):
            print("WARN: " + respuesta)

    def error(self, respuesta):
        if( self.nivel == Nivel.ERROR):
            print("ERROR: " + respuesta)
        
