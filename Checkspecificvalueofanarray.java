public class Checkspecificvalueofanarray
{
    public static void main(String args[] )
    {
        int a[] = {55, 45, 69, 44};
        int b = 55;
        boolean found = false;
        for (int c : a)
        {
            if (c == b)
            {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(" Found ");
        else
            System.out.println("Not Found");
    }
}

