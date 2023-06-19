package workshop_day_1;

public class MathChain {
    private int value;

    public MathChain(int value) {
        this.value = value;
    }

    public MathChain add(int num) {
        this.value += num;
        return this;
    }

    public MathChain subtract(int num) {
        this.value -= num;
        return this;
    }

    public MathChain multiply(int num) {
        this.value *= num;
        return this;
    }

    public MathChain divide(int num) {
        this.value /= num;
        return this;
    }

    public int getValue() {
        return this.value;
    }
}
