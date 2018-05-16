
public class HuantedHouse {

     int skeletons; 
     String name; 

      HuantedHouse(String name, int skeletons) { 
         this. name = name; 
        this.  skeletons = skeletons; 
     } 

     void doScaryStuff(int pumpkins, String scaryPhrase) { 
          System.out.println(pumpkins + " pumpkins say " + scaryPhrase) ;
     } 

     boolean isSpooky() { 
          //Haunted houses are spooky! 
          return true; 
     } 

  public static void main(String[] args) {
	HuantedHouse h = new HuantedHouse("SpookyZone", 105); 
          h.doScaryStuff(1000000, "Boo!"); 
          h.isSpooky(); 
     }
}   
    	  
         
     