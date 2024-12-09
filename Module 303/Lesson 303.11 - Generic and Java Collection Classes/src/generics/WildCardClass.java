package generics;

import java.util.List;

public class WildCardClass {

    public void printList(List<?> list){
        for(Object element : list){
            System.out.println(element);
        }
    }
}