import java.util.Random;

public class Main{
    //static method to roll a dice
    static Integer rollDice(){
        Random rand = new Random();
        return rand.nextInt(19)+1; //1 and 20
    }

    public static void main(String[] args){
        Integer r1,r2;
        double oneRaiseTwo;
        double sqrt1, sqrt2, distance;
        Integer minValue;
        Integer maxValue;
        
        // roll the dice
        r1=rollDice();
        r2=rollDice();
        
        // print the results of the dice rolls
        System.out.println("Dice 1:"+r1);
        System.out.println("Dice 2:"+r2);

        // perform calculations
        oneRaiseTwo = Math.pow(r1,r2);
        sqrt1=Math.sqrt(r1);
        sqrt2=Math.sqrt(r2);
        distance=Math.sqrt(Math.pow(r1,2)+Math.pow(r2,2));
        minValue=Math.min(r1,r2);
        maxValue=Math.max(r1,r2);
        // print the results
        System.out.println("Dice 1 raised to Dice2:     	"+oneRaiseTwo);
        System.out.println("Square root of Dice 1: "+sqrt1);
        System.out.println("Square root of Dice 2: "+sqrt2);
        System.out.println("Distance (using the formula sqrt(r1^2+r2^2)): "+distance);
        System.out.println("Smaller value: "+minValue);
        System.out.println("Larger value: "+maxValue);
    }
}
