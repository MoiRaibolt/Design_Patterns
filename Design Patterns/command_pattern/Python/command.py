from abc import ABC, abstractclassmethod

class Command(ABC):
    @abstractclassmethod
    def executar(self):
        pass

    @abstractclassmethod
    def desfazer(self):
        pass