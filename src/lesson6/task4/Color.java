package lesson6.task4;

public enum Color {

    RED("#ff0000"), GREEN("#00ff00"), BLUE("#0000ff"), WHITE("#ffffff"), BLACK("#000000");

    private String hex;
    private int r;
    private int g;
    private int b;

    Color(String hex) {
        this.hex = hex;
        int[] rgb = hexToRGB(hex);
        this.r = rgb[0];
        this.g = rgb[1];
        this.b = rgb[2];
    }

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.hex = rgbToHex(r, g, b);
    }

    public String getHex() {
        return hex;
    }

    public String rgbToHex(int r, int g, int b) {
        return String.format("#%02x%02x%02x", r, g, b);
    }

    public int[] hexToRGB(String hex) {
        String newHex = hex.replace("#", "");
        return new int[]{
                Integer.valueOf(newHex.substring(0, 2), 16),
                Integer.valueOf(newHex.substring(2, 4), 16),
                Integer.valueOf(newHex.substring(4, 6), 16)
        };
    }
}

