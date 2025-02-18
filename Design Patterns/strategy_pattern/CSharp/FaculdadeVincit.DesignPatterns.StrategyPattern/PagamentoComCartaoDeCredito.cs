namespace FaculdadeVincit.DesignPatterns.StrategyPattern;

public class PagamentoComCartaoDeCredito : IPagamentoStrategy
{
    public void Pagar(double valor)
    {
        var acrescimo = valor *.10;
        var ValorComAcrescimo = valor + acrescimo;
        Console.WriteLine($"pagamento de R$ {ValorComAcrescimo} realizado com sucesso!");
        Console.WriteLine($"Acréscimo de R$ {acrescimo} no Cartão");
    }
}
