/*public class SearchChar {


    //function to find the first occurance of ch in s 

    static int findChar(String s, char ch){
        int n = s.length();
        for (int i = 0; i <n; i++){
            //if the current character is equal to ch ,
            //return the current index
            if (s.charAt(i) == ch)
            return i;
        
            
            }
            //if we did not find any occurance of ch ,
            //return -1
            return -1;
        
    }
    public static void main(String as []){
        String s = "Ankit";
        char ch = 'k';
        System.out.println(findChar(s,ch));
    }
    
} */


 class SearchChar{
  public static void main(String as []){
        String s = "Ankit";
        char ch = 'k';

        //if character is found , returns the index of
        //first occurance of ch , otherwise retuens -1 
        int indexes = s.indexOf(ch);
        System.out.println("indexes = "+ indexes);
    }
}
