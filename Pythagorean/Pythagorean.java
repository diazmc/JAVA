import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB){
        
        int legA2 = (legA * legA);
        int legB2 = (legB * legB);

        double squareRoot = Math.sqrt(legA2 + legB2);

        return squareRoot;
    }
}