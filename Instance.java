public class Instance
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        String str = "ABANISH";
        Instance h=new Instance();
        System.out.println(h instanceof Instance);
        char[] ch = new char[str.length()];


        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }

        for (char c : ch) {
            System.out.println(c);
        }

    }
}