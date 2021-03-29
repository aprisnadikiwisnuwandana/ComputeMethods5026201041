import java.util.*;
import java.lang.*;

public class ComputeMethods5026201041 {

    public double fToC (double degreesF){
        double Celcius = (double) 5/9*(degreesF-32);
        System.out.println("Temp in celsius is " + Celcius);
        return Celcius;
    }

    public double hypotenuse(int a, int b){
        double Hypo = Math.sqrt(a*a + b*b);
        System.out.println("Hypotenuse is " + Hypo);
        return Hypo;
    }

    public int roll(){
        Random rndNum = new Random();
        int dice1 = rndNum.nextInt(6) + 1;
        int dice2 = rndNum.nextInt(6) + 1;
        int total = dice1 + dice2;
        System.out.println("The sum of the dice values is " + total);
        return total;
    }
}
