public class DisplayCelsiusObservable implements IObservable<Double> {

    @Override
    public void update(Double value) {
       System.out.println("Temperatura em Célsius: " + value + " ºC!");
    
    }

    @Override
    public void add(IObservable<Double> observable) {
        
    }

    @Override
    public void remove(IObservable<Double> observable) {
        
        
    }
           
}
