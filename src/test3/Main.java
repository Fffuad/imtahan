package test3;

public class Main {

    public static void main(String[] args) {
        int eded = 234;
        int topla = 0;
        for (int i = 0; i < 3; i++) {

            topla = (eded % 10) + topla;
            eded = eded / 10;

        }
        System.out.println(topla);
    }


}


