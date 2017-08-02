class GenericListTest {
    public static void main(String[] args) {
        GenericList list = new GenericList();

        try {
            list.method();
            System.out.println("Try block works!!!");
        }
        catch (Exception e){
            System.out.println("Something went wrong");
        }

    }
}