import Fruit.Fruit;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
 * поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
 */
public class Box<T extends Fruit> {

    private ArrayList<T> list;
        public Box (){
        this.list = new ArrayList<>();

    }
    public Box(T... fruits){
            this.list = new ArrayList<>(Arrays.aslist(fruits));
    }
    public float getWeight(){
            float weight = 0.0f;
            for(T o : list){
                weight += o.getWeight();

            }
            return weight;
                }
                public void pour(Box <T> another){
                    another.list.addAll(list);
                    list.clear();
        }
        public void add(T fruit){
            list.add(fruit);
        }
        public void add(Collections<T> fruit){
            list.addAll((Collection<? extends T>) fruit);
        }
        public boolean compare(Box<?> o){
            return Math.abs(this.getWeight() - o.getWeight()) < 0.0001;
        }



 }
