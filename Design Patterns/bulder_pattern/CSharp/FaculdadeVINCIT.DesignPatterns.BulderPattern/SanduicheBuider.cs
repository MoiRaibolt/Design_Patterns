namespace FaculdadeVINCIT.DesignPatterns.BulderPattern;

public class SanduicheBuilder
{
    private string _pao;
    private string _carne;
    private string _queijo;
    private bool _temSalada;

    public SanduicheBuilder SetPao(String pao) {
        this._pao = pao;
        return this;
    }

    public SanduicheBuilder SetCarne(String carne) {
        this._carne = carne;
        return this;
    }

    public SanduicheBuilder SetQueijo(String queijo) {
        this._queijo = queijo;
        return this;
    }

    public SanduicheBuilder SetTemSalada(bool temSalada) {
        this._temSalada = temSalada;
        return this;
    }

    public Sanduiche Build() {
        var Sanduiche = new Sanduiche(_pao, _carne, _queijo, _temSalada);
        return Sanduiche;
    }
}
