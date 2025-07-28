public class Rd6q5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");
        
        int m = 4; // starting index (inclusive)
        int n = 6; // ending index (exclusive)
        
        sb.delete(m, n); // removes characters from index 4 to 5 (not including 6)
        
        System.out.println("Output: " + sb.toString());
    }
}
    
