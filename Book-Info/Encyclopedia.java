public class Encyclopedia extends Book {
   // TODO: Declare private fields
  private String eEdition;
  private int numOfPages;
   
   // TODO: Define mutator methods - 
   //       setEdition(), setNumPages()
   public void setEdition(String edition) {
      eEdition = edition;
   }
   
   public void setNumPages(int numPages) {
      numOfPages = numPages;
   }
   
   // TODO: Define accessor methods -
   //       getEdition(), getNumPages()
   public String getEdition() {
      return eEdition;
   }
   
   public int getNumPages() {
      return numOfPages;
   }
   
   // TODO: Define a printInfo() method that overrides 
   //       the printInfo in Book class 
   public void printInfo() {
      super.printInfo();
      System.out.println("   Edition: " + eEdition);
      System.out.println("   Number of Pages: " + numOfPages);
   }
}