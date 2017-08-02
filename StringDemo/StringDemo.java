public class StringDemo {
    public static void main(String[] args) {
        // String ninja = "Coding Dojo is Awesome!";
        // int length = ninja.length();
        // System.out.println( "String Length is : " + length );

        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.);
        // System.out.println(ninja);

        String ninja = "Welcome to Coding Dojo!";
        int a = ninja.indexOf("Coding"); 
        int b = ninja.indexOf("co"); 
        int c = ninja.indexOf("pizza");
        System.out.println(a);
    }
}