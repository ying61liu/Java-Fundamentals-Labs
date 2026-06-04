// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   // TODO: Declare private fields
   private int numOfStrings;
   private int numOfFrets;
   private boolean isBowed;

   // TODO: Define mutator methods - 
   //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
   public void setNumOfStrings(int numStrings){
      numOfStrings = numStrings;
   }
   
   public void setNumOfFrets(int numFrets){
      numOfFrets = numFrets;
   }

   public void setIsBowed(Boolean bowed){
      isBowed = bowed;
   }
   
   // TODO: Define accessor methods - 
   //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
   public int getNumOfStrings() {
      return numOfStrings;
   }
   
   public int getNumOfFrets() {
      return numOfFrets;
   }
   
   public Boolean getIsBowed() {
      return isBowed;
   }
}

