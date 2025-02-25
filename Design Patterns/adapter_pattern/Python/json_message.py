from abc import ABC, abstractclassmethod

class JsonMessage(ABC):
    @abstractclassmethod
    def get_json(self):
        pass 