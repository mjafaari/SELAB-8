package flowers;

public class JapaneseFlower extends Flower {

    public JapaneseFlower(String nameToSet) {
        super(nameToSet);
    }

    @Override
    public Flower copy() {
        JapaneseFlower japaneseFlowerClone = new JapaneseFlower(this.getName());
        return japaneseFlowerClone;
    }
}
