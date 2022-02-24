public class Program {
    public static void main(String[] args) {
        //System.out.println("Hello World");
        //data types

        // byte, short, int, long, float, double
        int x = 100;
        long y = 1000000000000L;

        float z = 100.567f;
        double zz = 1234567.87643823433423d;

        System.out.println(x);

        //int + float = float
        //int newX = x + z; error because x + z returns float
        //System.out.println(x + z);

        // char, boolean
        char letter = 'a';

        boolean isTrue = true;
        boolean isFalse = false;

//        if(true) {
//            System.out.println(false);
//        }

        int i = 1;


        System.out.println("While Loop:");
        while(i < 5) {
            System.out.println(i);
            i++;
        }


        System.out.println("For Loop:");
        for(int j = 0; j <= 10; j += 2) {
            System.out.println(j);
        }

//        System.out.println(grading(90));
//        System.out.println(grading(80));
//        System.out.println(grading(70));
//        System.out.println(grading(60));
//        System.out.println(grading(59));

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
