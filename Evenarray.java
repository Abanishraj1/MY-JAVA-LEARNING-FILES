public class Evenarray
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,11,22,33,44};
        int even=0, odd=0;
        for (int i=0;i<15;i++)
        {
            if (a[i]%2==0)
                System.out.println(a[i]);
        }
    }
}
