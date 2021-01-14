package lesson12;

public class Main {

    public static void main(String[] args) {
        Report report = new Report();

        Row row1 = new Row(new String[]{"a", "b", "c"});
        report.getRows().add(row1);

        Row row2 = new Row(new String[]{"d", "e", "f"});
        report.getRows().add(row2);

        for (Row row : report.getRows()) {
            row.printToConsole();
            System.out.println();
        }
    }
}