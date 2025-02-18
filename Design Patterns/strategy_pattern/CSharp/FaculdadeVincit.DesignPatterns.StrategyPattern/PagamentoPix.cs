namespace FaculdadeVincit.DesignPatterns.StrategyPattern;

public class PagamentoPix : IPagamentoStrategy
{
    public void Pagar (double valor)
    {
        var desconto = valor *.10;
        var ValorComDesconto = valor - desconto;
        Console.WriteLine($"Pagamento de R$ {ValorComDesconto} realizado com sucesso!");
        Console.WriteLine($"Desconto por pgto. à vista: R$ {desconto}");
    }
}
