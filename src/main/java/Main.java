
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        System.out.println(a > b);
        if (a > b) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println((a > b) ? "True" : "False");
float x;
try {
    x = a/b;
}catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
}

try {

} finally {

}



        int grade = 50;
        switch (grade) {
            case 5:
                System.out.println("Best");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Norm");
                break;
            case 2:
                System.out.println("Bad");
                break;
            default:
                System.out.println("out of range");
        }

    }
}
