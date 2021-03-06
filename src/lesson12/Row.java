package lesson12;

public class Row {

    private final String[] cells;

    public Row(String[] cells) {
        this.cells = cells;
    }

    public String[] getCells() {
        return cells;
    }

    public void printToConsole() {
        for (String cell : cells) {
            System.out.print(cell + " ");
        }
    }
}
