package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int a = number % 10;
        int b = (number - a) / 10;
        int c = b % 10;
        int k = (b - c) / 10;
        int l = a * 100 + c * 10 + k;
        System.out.println(l);
    }

}