class removeChar{
    public static void main(String as[])
    {
        String str = "ANKIT";
        StringBuilder s = new StringBuilder(str);

        //print string after removal of character

        System.out.println(s.deleteCharAt(1));

    }
}