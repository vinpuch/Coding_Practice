public class Huhn extends Tier implements IPflanzenfresser {
    public Huhn(Lebend _lebensstatus, Integer _energie) {
        super(_lebensstatus, _energie);
    }

    @Override
    public void fressen(Pflanze pflanze) {
        this.setEnergie(pflanze.getEnergie()+this.getEnergie());
        pflanze.setLebensstatus(Lebend.TOD);

    }


}
