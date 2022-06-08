package factories;

import flowers.JapaneseFlower;
import trees.JapaneseTree;

public class JapaneseGardenFactory implements AbstractGardenFactory {

    @Override
    public JapaneseFlower createFlower() {
        return new JapaneseFlower();
    }

    @Override
    public JapaneseTree createTree() {
        return new JapaneseTree();
    }
}
