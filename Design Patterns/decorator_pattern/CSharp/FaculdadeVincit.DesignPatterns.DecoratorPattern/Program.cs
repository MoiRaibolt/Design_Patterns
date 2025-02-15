using FaculdadeVincit.DesignPatterns.DecoratorPattern;

ICafe cafe = new CafeSimples();
System.Console.WriteLine($"{cafe.Descricao} | preco {cafe.Custo}");

cafe = new CafeAdicionalDeLeite(cafe);
System.Console.WriteLine($"{cafe.Descricao} | preco {cafe.Custo}");

cafe = new CafeAdicionalDeAcucar(cafe);
System.Console.WriteLine($"{cafe.Descricao} | preco {cafe.Custo}");
