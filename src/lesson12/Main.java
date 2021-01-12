package lesson12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Report report = new Report();
        ArrayList<Row> rows = new ArrayList<>();

        Row row1 = new Row();
        row1.cells[0] = "a";
        row1.cells[1] = "b";
        row1.cells[2] = "c";
        rows.add(row1);

        Row row2 = new Row();
        row2.cells[0] = "d";
        row2.cells[1] = "e";
        row2.cells[2] = "f";
        rows.add(row2);

        report.rows = rows;

        int i = 0;
        while (i != 2) {
            Object o = report.rows.get(i);
            System.out.print(o.cells[0] + " " + o.cells[1] + " " + o.cells[2]);
            System.out.println();
        }
    }
}