public class PythagoreanTest {
    public static void main(String[] args){
        Pythagorean iD = new Pythagorean();
        double hypotenuse = iD.calculateHypotenuse(2, 4);

        System.out.println("The hypotenuse is " + hypotenuse);
    }
}