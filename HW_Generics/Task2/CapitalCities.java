public class CapitalCities<K, V> {
    public K country;
    public V capital;

    public CapitalCities(K country, V capital) {
        this.country = country;
        this.capital = capital;
    }

    public V getCapital() {
        return this.capital;
    }

    public K getCountry() {
        return this.country;
    }

    public void setCapital(V capital) {
        this.capital = capital;
    }
}