public class Averageofanarray
{
    public static void main(String[] args)
    {
        int a[] = {30,35,20,25,60,-16,-100};
        int sum = 0;
        for(int i=0; i < 7 ; i++)
            sum = sum + a[i];

        int average = sum / 7;
        System.out.println("Average is : " + average);
    }
}

