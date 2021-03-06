package ioreaderclasspath.countries;

public class Country {

    private final String name;
    private final int borderCountries;

    public Country(String name, int borderCountries) {
        this.name = name;
        this.borderCountries = borderCountries;
    }

    public String getName() {
        return name;
    }

    public int getBorderCountries() {
        return borderCountries;
    }

}
