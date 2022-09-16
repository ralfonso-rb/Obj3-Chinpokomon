from model.logger.nivel import Nivel

def singleton(cls):

    instances = dict()

    def wrap(*args, **kwargs):
        if cls not in instances:
            instances[cls] = cls(*args, **kwargs)

    return wrap

@singleton
class Logger(object):

    def __init__(self, nivel=Nivel.INFO):
        self._nivel = nivel

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
        
