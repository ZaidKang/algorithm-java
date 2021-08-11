import java.util.ArrayList;
import java.util.List;

public class test {
    //1,2,3 으로 조합 가능한 모든 수 출력
    public static void main(String[] args) {

        int[] num = new int[3];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;

        boolean[] mapping = new boolean[3];
        mapping[0] = false;
        mapping[1] = false;
        mapping[2] = false;

        recursion(num,mapping,0);
    }

    public static void recursion(int[] num, boolean[] mapping,int index) {

        if (index == 3) {
            for (int i = 0; i < num.length; i++) {
                if (mapping[i] == true) {
                    System.out.print(num[i]);
                }
            }
            System.out.println(System.lineSeparator());
            return;
        }

        mapping[index] = true;
        recursion(num, mapping, index + 1);

        mapping[index] = false;
        recursion(num,mapping,index+1);

    }
}
