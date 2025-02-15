public interface IObservable<TValue> {
    void update(TValue value);

    void add(IObservable<TValue> observable);

    void remove(IObservable<TValue> observable);
}
