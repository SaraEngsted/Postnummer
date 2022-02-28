public class Postnummer {

    private int zipcode;
    private String cityName;

    public Postnummer(int zipcode, String cityName) {
        this.zipcode = zipcode;
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Postnummer " +
                "Zipcode = " + zipcode +
                ", CityName = " + cityName;
    }
}
