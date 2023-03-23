class Copyarray
{
    public static void main(String[] args)
    {
        int a1[] ={1, 2, 3, 4, 5};
        int a2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a2[i] = a1[i];
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.print(a2[i] + " ");
        }
    }
}
