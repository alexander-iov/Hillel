package lesson5.task3;

public class Bottle {

    private final int volume;
    private Liquid liquid;
    private final boolean isCarbonated;

    Bottle(int volume, boolean isCarbonated, int density, String color) {
        this.volume = volume;
        this.isCarbonated = isCarbonated;
        setLiquid(density, color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Bottle bottle = (Bottle) o;
        return volume == bottle.volume &&
                isCarbonated == bottle.isCarbonated &&
                liquid.equals(bottle.liquid);
    }

    private void setLiquid(int density, String color) {
        liquid = new Liquid(density, color);
    }

}

