package golivkin.dz_06.task_01;

 class Grain extends Product {
    private int weight;
    Grain(int weight, int cost) {
        super(cost);
        this.weight = weight;
    }

    @Override
    int getCost() {
        return super.getCost() * weight;
    }


}
