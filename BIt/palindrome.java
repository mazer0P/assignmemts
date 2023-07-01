public class BinaryPalindrome {
    public static int findAthBinaryPalindrome(int A) {
        int count = 0;
        int num = 1;
        
        while (count < A) {
            String binary = Integer.toBinaryString(num);
            
            if (isPalindrome(binary)) {
                count++;
                
                if (count == A) {
                    return num;
                }
            }
            
            num++;
        }
        
        return -1; 
    }
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        int A = 1;
        int result = findAthBinaryPalindrome(A);
        System.out.println(result); 
        
        A = 9;
        result = findAthBinaryPalindrome(A);
        System.out.println(result); 
    }
}
