package RentalCarUltimate_;

import java.util.List;

public class Data {
    // Setlemeyi düşünmediğim için sadece get kullandım. Zaten default verdik değerleri...
    private List<String> modeller = List.of("Golf", "V40", "1.16", "A3", "S500", "Vogue", "Veyron");
    private List<String> markalar = List.of("Volkswagen", "Volvo", "BMW", "Audi", "Mercedes", "Range Rover", "Bugatti");
    private List<String> yakitTurleri = List.of("Diesel", "Benzin", "Hibrit");
    private List<String> vitesTurleri = List.of("Manuel", "Otomatik");
    private List<Double> dailyPrice = List.of(100.0, 150.0, 200.0, 250.0, 300.0, 400.0, 500.0);

    public List<String> getMarkalar() {
        return markalar;
    }

    public List<String> getModeller() {
        return modeller;
    }

    public List<String> getYakitTurleri() {
        return yakitTurleri;
    }

    public List<String> getVitesTurleri() {
        return vitesTurleri;
    }

    public List<Double> getDailyPrice() {
        return dailyPrice;
    }
}
