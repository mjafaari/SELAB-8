package trees;

public class JapaneseTree extends Tree {

    public JapaneseTree(String nameToSet) {
        super(nameToSet);
    }

    @Override
    public Tree copy() {
        JapaneseTree japaneseTreeClone = new JapaneseTree(this.getName());
        return japaneseTreeClone;
    }
}
