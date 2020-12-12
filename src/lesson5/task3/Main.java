package lesson5.task3;

public class Main {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(500, false, 15, "RED");
        Bottle bottle2 = new Bottle(500, true, 20, "GREEN");
        Bottle bottle3 = new Bottle(500, false, 15, "RED");

        Bottle[] bottles = new Bottle[] {bottle1,bottle2,bottle3};

        for (int i = 0; i < bottles.length; i++){
            for (int j = 0; j < bottles.length; j++){
                if (i == j){
                    continue;
                }
                boolean a = bottles[i].equals(bottles[j]);
                System.out.println(a);
            }
        }
    }
}
