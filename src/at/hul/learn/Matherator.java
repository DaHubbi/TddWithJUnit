package at.hul.learn;

public class Matherator implements Adder, Subtracter {
    @Override
    public long add(long... operands) {
        long Add = 0;
        for (long operand : operands) {
            Add += operand;
        }
        return Add;
    }

    @Override
    public long subtract(long... operands) {
        long Sub = operands[0];
        for (int i = 1; i < operands.length; i++){
            Sub -= operands[i];
        }
        return Sub;
    }
}
