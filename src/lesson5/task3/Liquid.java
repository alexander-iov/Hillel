package lesson5.task3;

public class Liquid {
    private int density;
    private String color;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Liquid liquid = (Liquid) o;
        return density == liquid.density &&
                color.equals(liquid.color);
    }

}
