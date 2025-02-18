from abc import ABC, abstractclassmethod

class PagamentoStrategy(ABC):
    @abstractclassmethod
    def pagar(self, valor):
        pass