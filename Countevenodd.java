public class Countevenodd
{
    public static void main(String[] args)
{
    int a[]  = {5,7,2,4,9,1,13};
    int even = 0, odd = 0;

    for(int i = 0; i < 7; i++) {
        if(a[i] % 2 == 0)
        {
            even++;
        }
        else
            odd++;
    }
    System.out.printf("\n even : %d",even);
    System.out.printf("\n odd : %d",odd);

}
}
