package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ListTest {

    static int count;

    public static void main(String[] args) {

        Random random = new Random();
        int num;
        boolean isSame;


        ArrayList list = new ArrayList();

        for (int i = 0; i < 6; i++) {
            num = 1 + random.nextInt(45);
            isSame = list.contains(num);

            if (isSame == false) {
                list.add(num);
            } else {
                i--;
            }
            count++;
        }
//        list.
        System.out.println(count + "회 만에 다음의 숫자 리스트를 뽑았습니다!" + list);


    }
}
