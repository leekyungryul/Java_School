package Sleep;


public class Sleep1 {
	 
    public static void main(String[] args) throws InterruptedException {
         
         
        
               
        int i=0;
        while(true){
             
             
            System.out.println("hello " + i) ;
             
            Thread.sleep(100);
             
             i= i+1;
        }
         
    }
}