package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {

        int a = number%10;
        int b = (number-a)/10;
        int c = b%10;
        int d = (b-c)/10;
        int l = d%10;
        int k  = (d-l)/10;
        System.out.println(a+c+l+k);
    }

}

