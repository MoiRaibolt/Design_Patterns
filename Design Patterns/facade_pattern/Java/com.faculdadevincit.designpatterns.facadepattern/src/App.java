public class App {
    public static void main(String[] args) throws Exception {
        LojaFacade loja = new LojaFacade();

        loja.FazerPedido("Laptop", 2999.90);
        loja.FazerPedido("Smartphone", 1999.90);
        loja.FazerPedido("Jogo de Mesa com 4 Cadeiras", 799.90);
    }
}
