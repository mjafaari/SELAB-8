package trees;

public abstract class Tree {
    private String name;

    public Tree(String nameToSet){
        name = nameToSet;
    }

    public String getName(){
        return name;
    }

    public abstract Tree copy();
}
