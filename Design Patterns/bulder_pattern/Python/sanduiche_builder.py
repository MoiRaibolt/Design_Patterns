
class Sanduiche:
    def __init__(self):
        self.pao = None
        self.carne = None
        self.queijo = None
        self.tem_salada = False

    def mostrar_informacoes_pedido(self):
        salada = "com salada" if self.tem_salada else "sem salada"
        print(f"Sanduiche: {self.pao} com carne {self.carne} e queijo {self.queijo} {salada}")



from sanduiche import Sanduiche

class SanduicheBuilder:
    def __init__(self):
        
        self.pao = None
        self.carne = None
        self.queijo = None
        self.tem_salada = False

    def set_pao(self, pao):
        self.pao = pao
        return self

    def set_carne(self, carne):
        self.carne = carne
        return self

    def set_queijo(self, queijo):
        self.queijo = queijo
        return self

    def set_tem_salada(self, tem_salada):
        self.tem_salada = tem_salada
        return self

    def build(self):
        
        sanduiche = Sanduiche()
        sanduiche.pao = self.pao
        sanduiche.carne = self.carne
        sanduiche.queijo = self.queijo
        sanduiche.tem_salada = self.tem_salada

        return sanduiche
