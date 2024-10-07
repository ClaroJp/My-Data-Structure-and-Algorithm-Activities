import java.util.Scanner;
public class Palindrome{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        isPalindrome(word);
    }
    public static void isPalindrome(String word){
        word.toLowerCase();
        String reverse ="";
        for(int i = 0; i < word.length(); i++){
            reverse = word.charAt(i) + reverse;
        }
        if(reverse.equals(word)){
            System.out.print(word + " is Palindrome");

        }else{
            System.out.print(word + " is not Palindrome");
        }
    }
}