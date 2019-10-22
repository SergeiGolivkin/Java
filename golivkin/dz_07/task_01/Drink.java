package golivkin.dz_07.task_01;

 enum Drink {
     COCACOLA("Кока-Кола", 60),
    PEPSI("Пепси", 50),
    FANTA("Фанта", 45),
    SPRAIT("Спрайт", 65),
    SCHWEPPES("Швепс", 75);

    private String title;
    private int price;
    Drink(String title, int price){
        this.title = title;
        this.price = price;
    }
     public String getTitle() {
         return title;
     }
     public int getPrice(){
        return price;
     }

}
