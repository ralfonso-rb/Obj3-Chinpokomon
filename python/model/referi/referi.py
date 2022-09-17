from model.batalla.batalla import Batalla

class Referi ():
    def __init__(self, batalla):
        self._batalla = batalla
    
    @property
    def batalla(self):
        return self._batalla

    @batalla.setter
    def batalla(self, batalla):
        self._batalla = batalla
    
    def gestionar_batalla(self):
        self.batalla.comenzar_batalla()