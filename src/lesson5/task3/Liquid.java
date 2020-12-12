package lesson5.task3;

public class Liquid {
    private int density;
    private String color;

    Liquid(int density, String color) {
        this.density = density;
        this.color = color;
    }

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
