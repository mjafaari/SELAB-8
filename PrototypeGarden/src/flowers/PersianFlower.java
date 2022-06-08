package flowers;

public class PersianFlower extends Flower {

    public PersianFlower(String nameToSet) {
        super(nameToSet);
    }

    @Override
    public Flower copy() {
        PersianFlower persianFlowerClone = new PersianFlower(this.getName());
        return persianFlowerClone;
    }
}
