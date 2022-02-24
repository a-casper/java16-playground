public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(grading(90));
        System.out.println(grading(80));
        System.out.println(grading(70));
        System.out.println(grading(60));
        System.out.println(grading(59));

    }

    public static String grading(int score) {
        if(score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
