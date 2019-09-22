package golivkin.dz_06.task_01;

 class Cosmetics extends Product {
    private int quantity;

    Cosmetics(int quantity, int cost) {
        super(cost);
        this.quantity = quantity;
    }

    @Override
    int getCost() {
        return super.getCost() * quantity;
    }

}
