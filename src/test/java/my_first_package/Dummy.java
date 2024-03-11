package my_first_package;

public class Dummy {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i <100 ; i++) {
            Thread.sleep(1000);
            System.out.println("\"Hello\" = " + "Hello");
        }
    }
}
