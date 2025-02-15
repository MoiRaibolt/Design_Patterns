public class DisplayFarenheitObservable implements IObservable<Double> {

    @Override
    public void update(Double value) {
        double farenheit = (value * 9 / 5) + 32;
        System.out.println("temperatura em Farenheit: " + farenheit + " ºF");
    }

    @Override
    public void add(IObservable<Double> observable) {
        
    }

    @Override
    public void remove(IObservable<Double> observable) {
    
    }

}
