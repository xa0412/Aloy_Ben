package Pra1;
import java.util.List;

public class FruitStall<T extends Fruit> {
    private List<T> fruits;
    
    // The fruit always take in a subtype of
    // List<T>, so it is safe to type cast into List<T>
    @SuppressWarnings("unchecked")
    public FruitStall(List<? extends T> fruits) {
        this.fruits = (List<T>) fruits;
    }
    
    public FruitStall() {
        this.fruits = List.of();
    }
    
    public List<T> getFruits() {
        return this.fruits;
    }
    
    public List<T> findFruitsByName(String name) {
        return this.fruits.stream()
                          .filter(x -> x.getName().equals(name))
                          .toList();
    }
    
    @Override
    public String toString() {
        return this.fruits.stream()
                          .map(x -> x.toString())
                          .reduce("", (x, y) -> x + "- " + y + "\n");
    }
}
