using FaculdadeVINCIT.DesignPatterns.BulderPattern;

var SanduicheBuilder = new SanduicheBuilder();
var sanduiche = SanduicheBuilder.SetPao("Americano")
                                .SetCarne("blend bovino-suino")
                                .SetQueijo("Cheddar")
                                .SetTemSalada(false)
                                .Build();

sanduiche.MostrarInformacoesPedido();