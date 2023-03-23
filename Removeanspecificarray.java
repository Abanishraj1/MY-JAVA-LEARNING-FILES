import java.util.Arrays;

public class Removeanspecificarray
{
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        int b[] = new int[9-1];
        int j=7;
        for(int i=0, k=0;i<9;i++){
            if(a[i]!=j){
                b[k]=a[i];
                k++;
            }
        }
        System.out.println("New array :" + Arrays.toString(b));
    }
}

