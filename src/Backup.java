import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class Backup {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Ǯ: �ϸ��� 2��� ���� (������)
        //�䳢: �ϸ��� �Ѹ����� Ǯ 1�� �Ҹ�
        //
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Ǯ �䳢 ����");
        int[] in = Stream.of(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int g = in[0];
        int r = in[1];
        int w = in[2];
        while (true) {
            if (g >= r) {
                g -= r;
            } else {
                r -= g;
            }
            g *= 2;
            System.out.println(g + " " + r + " " + w);
            Thread.sleep(500);
        }
    }

}