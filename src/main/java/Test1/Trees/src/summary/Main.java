package Test1.Trees.src.summary;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int x = 5;
        int y = 10;
        int expectedResult = 15;
        int actualResult = calculator.sum(x,y);
        if (expectedResult == actualResult)
            System.out.println("test Ok");
        int expectedResult2 = 50;
        int actualResult2 = calculator.multiply(x,y);
        if (expectedResult2 == actualResult2)
            System.out.println("test2 Ok");
    }
}
