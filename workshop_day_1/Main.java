package workshop_day_1;

public class Main {

    public static void main(String[] args) {

        int result = new MathChain(10)
                .add(5)
                .multiply(2)
                .subtract(3)
                .divide(4)
                .getValue();
        System.out.println(result);

    }
}
