public class Lebewesen{
    public Lebend getLebensstatus(Lebend _lebensstatus) {
        if (_lebensstatus == Lebend.TOD){
            return _lebensstatus;
        }
        else{
            throw new RuntimeException("tier ist am leben");

        }
    }


    public void setLebensstatus(Lebend _lebensstatus) {
        if (_lebensstatus == Lebend.LEBEN){
            this._lebensstatus = _lebensstatus;
        }
    }

    @Override
    public String toString() {
        return "Lebewesen{" +
                "_lebensstatus=" + _lebensstatus +
                '}';
    }

    public Lebewesen(Lebend _lebensstatus, Integer energie) {
        this._lebensstatus = _lebensstatus;
        _energie = energie;
    }

    private Lebend _lebensstatus;
    private Integer _energie;

    public Integer getEnergie() {
        return _energie;
    }

    public void setEnergie(Integer _energie) {
        this._energie = _energie;
    }
}
