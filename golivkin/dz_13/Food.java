package golivkin.dz_13;

 enum
 Food {
    APPLE("Яблоко"),
    BANANA("Банан"),
    BROCCOLI("Броколи"),
    CAKE("Торт"),
    PORRIDGE("Каша");



      private String title;

    Food(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
