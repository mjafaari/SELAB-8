package factories;

public interface AbstractGardenFactory<T, Y> {
    T createFlower() ;
    Y createTree() ;
}
