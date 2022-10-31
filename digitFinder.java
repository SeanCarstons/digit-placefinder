import java.util.Scanner;
public class U4_L2_Activity_Two
{
  public static void main(String[] args)
  {

    //create scanner 
    Scanner scan = new Scanner(System.in);
    //prompt question
    System.out.println("Enter a positive integer:");
    //get number
    int n = scan.nextInt();
    //turn it into a String to use later as a substring 
    String nStr = String.valueOf(n);
    //get the length of the value 
    int leng = String.valueOf(nStr).length();
    String b; //to get the single digit for each place 
    //Use loop with index
    int index = 0;
    while (Math.pow(10,index) < n) {//keep running until the 
      leng--; //decrease length for the substring 
      index++; //increase index to raise the power of math pow
      b = String.valueOf(nStr.substring(leng, leng+1));// get each value per loop 
     System.out.print("\n" +( b + String.valueOf((int)Math.pow(10,index-1)).substring(1))); 
     //get the value of digit place, than add it with the zeros needed to form the position 
    }
    
    //Close scanner
    scan.close();

  }
}
