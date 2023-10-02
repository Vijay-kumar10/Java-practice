import java.util.*;
public class Strings {

   public static void printChar(String str){
      for(int i=0 ; i<str.length(); i++){
         System.out.print(str.charAt(i) + " ");
      }
   }
   ///////////////////////////////////////////////////

   //check palendrom
   public static boolean checkPalendrom(String str){
      int n = str.length();
      for(int i=0 ; i<n/2 ; i++){
         if(str.charAt(i) != str.charAt(n-1-i)){
            System.out.println("It is not a palendrome");
            return false;
         }
      }
      return true;
   }


   ////////////////////////////////////////////////////////
   // Substring function
   public static void subString(String str){

      for(int i=0 ; i<str.length() ; i++){
         for(int j=0 ;j<str.length() ; j++){
            for(int k=i ;k<=j ;k++){
               System.out.print(str.charAt(k));
            }
            System.out.print(" ");
         }
         System.out.println();
      }
   }

   //////////////////////////////////////////////////////
   //convert uppercase
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = "ABCDE";
      String str1 = new String ("noon");


      //take input from user
      // System.out.print("Enter your name : ");
      String str2 = sc.nextLine();
      // System.out.println("Your name is : "+str2);

      //call to printChar function
      // printChar(str);

      //call to checkpalendrome function
      // System.out.println(checkPalendrom(str));


      //use equal function for check similarity
      // if(str==str1){
      //    System.out.println("It is similar string");
      // }else{
      //    System.out.println("It is not equal");
      // }
      // if(str.equals(str1) ){
      //    System.out.println("It is similar string");
      // }else{
      //    System.out.println("It is not equal");
      // }

      //call to subString function
      subString(str);



 
   } 
}
