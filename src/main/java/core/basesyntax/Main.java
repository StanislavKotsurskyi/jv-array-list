package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<>();
        System.out.println(test);
        for (int i = 0; i < 5; i++) {
            test.add(Integer.toString(i));
        }
        System.out.println(test);
        test.remove("2");
        System.out.println(test);

        java.util.ArrayList<String> utilTest = new java.util.ArrayList<>();
        for (int i = 0; i < 5; i++) {
            utilTest.add(Integer.toString(i));
        }
        System.out.println(utilTest);
        utilTest.remove(-2);
        System.out.println(utilTest);
    }
}
