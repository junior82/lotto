package project;

import java.util.Random;
import java.util.Arrays;
public class Lotto {
    private Random random = new Random(System.nanoTime());
    private int[] generate(){
        int[] result = new int[6];
        
        for(int i =0 ; i < 6 ; i++){
            result[i] = random.nextInt(45) + 1;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] result = new Lotto().generate();
        System.out.println(Arrays.toString(result));
    }
}
