package src;


    public class Example1 {
        public static void main(String[] args) {
            message1();
            message2();
            System.out.print("4 ");
        }
    
        public static void message1() {
            System.out.print("7 ");
        }
    
        public static void message2() {
            System.out.print("5 ");
            message1();
            System.out.print("6 ");
        }
    }
