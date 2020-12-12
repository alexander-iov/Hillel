package lesson5.task3;

public class Bottle {

    private int volume;
    private Liquid liquid;
    private boolean isCarbonated;

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

}

