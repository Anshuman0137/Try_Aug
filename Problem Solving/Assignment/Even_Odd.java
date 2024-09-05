


    /*
 * Alice and Bob selects integers from the sequence. Alice always moves first.
 * Alice wins if the sum of her selection = Even otherwise Bob wins.
 * Find who will win if both players play optimally.
 */

 public class Even_Odd {
    public static void main(String args[]){
        
        int arr[] = {7,9,11,15};              // Al Odd integers in sequence.
        // int arr[] = {7,8,9,10};            // All nEven in sequence. 
        //int arr[] = {1,3,4,2,6,8,9,15,25,4}
        //int arr[] = {3,5};                  // Only Two Odd integers.
        //int arr[] = {6,8};                  // Only Two Even integers.
        
        int n = arr.length;
        int nOdds = 0, nEvens = 0;            // Storing Total number of Odd and Even integers in the sequence.
        int sum = 0;

        for(int i=0;i<n;i++){
            int ele = arr[i];
            sum = sum + ele;

            if(ele%2==0)         // Checking for Even parity of the element.
             nEvens++;
             
             else                // Defaults to Odd parity of the element.
              nOdds++;
        }




        if(nOdds % 4 == 2)                                       //Out of the remaing two 1's Alice will have to take one extra 1 making her sum Odd  
           System.out.println("Bob Wins");
        
          else if(nOdds % 4 == 3)                                 
            System.out.println("Alice Wins");                  //Alice has first move advantage, out the remaing Three 1's she can get Two 1's making her sum Even.
        
             else if(nOdds % 4 == 0)                             //Both Bob and Alice get equal 1's.
                System.out.println("Alice Wins");

              else if(nOdds % 4 == 1){
                    
                    if(nEvens % 2 == 0)                          //Even numbers of EVEN integers
                        System.out.println("Bob Wins");
                        
                        else                                     //Odd numbers of EVEN integers.
                         System.out.println("ALice Wins");
            }
        

        }
    }




