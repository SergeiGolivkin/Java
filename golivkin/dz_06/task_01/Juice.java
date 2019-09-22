package golivkin.dz_06.task_01;

 class Juice extends Product {
    private int volume;

    Juice(int volume, int cost) {
        super(cost);
        this.volume = volume;
    }

    @Override
    int getCost() {
        return super.getCost() * volume;
    }

}
