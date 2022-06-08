package factories;

import flowers.PersianFlower;
import trees.PersianTree;

public class PersianGardenFactory implements AbstractGardenFactory {

    @Override
    public PersianFlower createFlower() {
        return new PersianFlower();
    }

    @Override
    public PersianTree createTree() {
        return new PersianTree();
    }
}
