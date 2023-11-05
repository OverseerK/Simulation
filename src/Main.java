import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> w = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("grass, rabbit, wolf");
        int g = scan.nextInt();
        int rn = scan.nextInt();
        int wn = scan.nextInt();
        for (int i = 0; i < rn; i++) {
            r.add(0);
        }

        for (int i = 0; i < wn; i++) {
            w.add(0);
        }
        while (true) {
            int rc = r.size();
            int wc = w.size();
            System.out.println("grass: " + g + " rabbit: " + rc + " wolf: " + wc);
            System.out.println(r);
            if (rc > 0) {
                for (int in = 0; in < rc; in++) {
                    int age = r.get(in);
                    if (age > 3) {
                        r.set(in, -1);
                    } else if (g > 0) {
                        r.set(in, age + 1);
                        g--;
                    } else {
                        r.set(in, -1);
                    }
                }
                while (r.remove(Integer.valueOf(-1))) {}
                for (int in = 0; in < rc / 2; in++) {
                    r.add(0);
                }
            }
            g *= 2;
            Thread.sleep(1000);
        }
    }
}