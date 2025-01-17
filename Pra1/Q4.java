package Pra1;

import java.util.List;
import java.util.stream.Stream;

public class Q4 {
  public static <T extends Fruit> FruitStall<Fruit> mergeStalls (FruitStall<? extends T> fs1, FruitStall<? extends T> fs2) {
    return new FruitStall<>(Stream.concat(fs1.getFruits().stream(), fs2.getFruits().stream()).toList());
  }
}