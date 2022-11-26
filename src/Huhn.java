public class Huhn extends Tier implements IPflanzenfresser {
    public Huhn(Lebend _lebensstatus, Integer _energie) {
        super(_lebensstatus, _energie);
    }

    @Override
    public Integer fressen(Tier tier, Pflanze pflanze) {
        return null;
    }
}
