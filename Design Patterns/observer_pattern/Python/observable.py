from abc import ABC, abstractclassmethod
from typing import TypeVar, Generic

TValue = TypeVar("Tvalue")

class Observable(Generic[TValue]):
    @abstractclassmethod
    def update(self, value : TValue):
        pass