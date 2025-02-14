import java.util.ArrayList;
import java.util.List;
 
public class insertCharatmultipleposition{
   
  // Function to add stars
    public static String addStars(String s, List<Integer> stars) {
        // Iterate through the vector of positions
          int k = 0;
        for (int i = 0; i < stars.size(); i++) {
            // Insert a star at the specified position
              s = s.substring(0, stars.get(i) + k) + "*" + s.substring(stars.get(i) + k);
            k++;
        }
          // Return result
        return s;
    }
 
    public static void main(String[] args) {
        // Test case
          String str = "geeksforgeeks";
        List<Integer> chars = new ArrayList<>();
        chars.add(1);
        chars.add(5);
        chars.add(7);
        chars.add(9);
        String ans = addStars(str, chars);
        System.out.println(ans);
    }
}