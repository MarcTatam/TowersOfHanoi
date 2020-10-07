import java.util.ArrayList;
import java.util.Arrays;

public class towers {
    public static void  main(String[] args){
        setup(100);
        hanoi(100,1,3,2);
        System.out.println(peg3);
        }
    public static ArrayList<Integer> peg1 = new ArrayList<>();
    public static ArrayList<Integer> peg2 = new ArrayList<>();
    public static ArrayList<Integer> peg3 = new ArrayList<>();
    public static void setup(int discs){
        for(int i = 1; i < discs; i ++){
            peg1.add(i);
        }
    }
    public static void move(int source, int destination){
        int temp = 0;
        if (source == 1 && peg1.size() > 0){
            temp = peg1.get(peg1.size()-1);
            peg1.remove(peg1.size()-1);
        }
        else if (source == 2 && peg2.size() > 0){
            temp = peg2.get(peg2.size()-1);
            peg2.remove(peg2.size()-1);
        }
        else if (source == 3 && peg3.size() > 0){
            temp = peg3.get(peg3.size()-1);
            peg3.remove(peg3.size()-1);
        }
        if (destination == 1){
            peg1.add(temp);
        }
        else if (destination == 2){
            peg2.add(temp);
        }
        else if (destination == 3){
            peg3.add(temp);
        }
        System.out.println(peg1);
        System.out.println(peg2);
        System.out.println(peg3);
    }
    static void hanoi(int discs, int sourcePeg, int destinationPeg, int extraPeg){
        if (discs == 1) {
            move(sourcePeg, destinationPeg);
        }
        else{
            hanoi(discs-1, sourcePeg, extraPeg, destinationPeg);
            move(sourcePeg, destinationPeg);
            hanoi(discs-1, extraPeg, destinationPeg, sourcePeg);
        }
    }
}
