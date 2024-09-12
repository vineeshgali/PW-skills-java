/**
 * Recursion
 */
public class Recursion {
    public static void mango(){
        System.out.println("in mango");
    }
    private static void apple() {
        mango();
            System.out.println("im in banana");
        }
public static void banana() {
    apple();
        System.out.println("im in banana");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("im in main");
        banana();
    }

    
}