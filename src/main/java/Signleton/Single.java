package Signleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single {
    private Integer[] numbers = {9,8,7,6,5,4,3,2,1};
    private List<Integer> list = Arrays.asList(numbers);
    private static Single instance;

    public static Single getInstance(){
        if(instance == null ) instance =  new Single();
        return instance;
    }
    private Single() {
        System.out.println("object created");
        Collections.shuffle(list);
    }

    public void  printer(){
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
