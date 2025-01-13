import java.util.Scanner;
class CountVowelsAndConsonants{
     public static void countVowelsAndConsonants(String text){
	 
	 int countVowels=0;
	 int countConsonants=0;
	 
	 text= text.toLowerCase();
	  for (int i=0; i<text.length(); i++){
	     char ch= text.charAt(i);
	      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			 
			 countVowels++;  
		  }
		else{
			countConsonants++;
		}  
	 }
	System.out.println("The count of the vowels is "+countVowels+" and countConsonants is "+countConsonants );
    }
   
   public static void main(String[] args){
   
   Scanner input= new Scanner(System.in);
   System.out.print("Enter the string text: " );
   String text=input.nextLine();
   
   countVowelsAndConsonants(text);
   
   input.close();
   }

}