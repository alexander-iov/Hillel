package lesson12;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Report report = new Report();
        List<Row> rows = new ArrayList<>();

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

        for (Row row : report.rows){
            for (String cell : row.cells){
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}