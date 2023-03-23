import java.util.Arrays;

public class Insertanumberinanarray
{
    public static void main(String[] args) {

        int a[] = {11,12,13,14,15,16};
        int b = 6;
        int c[] = new int[b+1];
        int value = 1r7;
        for(int i = 0; i<b; i++) {
            c[i] = a[i];
        }
        c[b] = value;
        System.out.println(Arrays.toString(c));
    }
}