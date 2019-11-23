package baabol;

public class Main {
    public static void main(String[] args) {
        int [] t = TableUtilitis.createAndFillTable(10, 5, 20);
        TableUtilitis.print(t);
        BubbleSort bs = new BubbleSort();
        bs.sort(t);
        System.out.println("Tablica przed sortowaniem");
        TableUtilitis.print(t);

    }
}
