public class App {
    public static void main(String[] args) throws Exception {
        SanduicheBuilder sanduicheBuilder = new SanduicheBuilder();
        Sanduiche sanduiche = sanduicheBuilder.setPao("Australiano")
                                              .setCarne("Avestruz")
                                              .setQueijo("Mozzarella")
                                              .setTemSalada(true) 
                                              .Build();
                                              
        sanduiche.mostrarInformacoesPedido();                                      
    }
}
