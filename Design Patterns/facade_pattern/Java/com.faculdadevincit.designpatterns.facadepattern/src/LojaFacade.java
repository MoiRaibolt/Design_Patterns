public class LojaFacade {
    private ProcessadorDePedidos processadorDePedidos;
    private SistemaDePagamento sistemaDePagamento;
    private SistemaDeEnvio sistemaDeEnvio;

    public LojaFacade() {
        processadorDePedidos = new ProcessadorDePedidos();
        sistemaDePagamento = new SistemaDePagamento();
        sistemaDeEnvio = new SistemaDeEnvio();
    }

    public void FazerPedido(String item, double valor) {
        processadorDePedidos.CriarPedido(item);
        sistemaDePagamento.ProcessarPagamento(valor);
        sistemaDeEnvio.EnviarPedido(item);

        System.out.println("Pedido realizado com sucesso!");
    }
}
