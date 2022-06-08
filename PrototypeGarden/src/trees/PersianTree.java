package trees;

public class PersianTree extends Tree {

    public PersianTree(String nameToSet) {
        super(nameToSet);
    }

    @Override
    public Tree copy() {
        PersianTree persianTreeClone = new PersianTree(this.getName());
        return persianTreeClone;
    }
}