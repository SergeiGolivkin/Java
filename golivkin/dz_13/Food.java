package golivkin.dz_13;

public enum Food {
    APPLE("Яблоко"),
    BANANA("Банан"),
    BROCCOLI("Броколи"),
    CAKE("Торт"),
    PORRIDGE("Каша");



    public  String title;

    Food(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
