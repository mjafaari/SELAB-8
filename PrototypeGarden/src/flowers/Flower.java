package flowers;

public abstract class Flower {
    private String name;

    public Flower(String nameToSet){
        name = nameToSet;
    }

    public String getName(){
        return name;
    }

    public abstract Flower copy();
}
