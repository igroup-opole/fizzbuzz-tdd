package igroup;

public class Main {
    public static void main(String[] args) {
        String name = "Rafał Schmidt";
        int age = 21;
        age = 13;

        System.out.println("Hello World");
        System.out.println(name);
        System.out.println(age);

        if (isAdult(age)) {
            System.out.println("Im an adult");
        } else {
            System.out.println("Im a teenager");
        }

        FizzBuzz fizzBuzz = new FizzBuzz();

        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.check(i));
        }

    }

    private static boolean isAdult(int age) {
        return age >= 18;
    }
}
