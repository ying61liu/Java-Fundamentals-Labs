public class Course{
   // TODO: Declare private fields
   private String number;
   private String title;

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
   public void setCourseNumber(String courseNumber) {
      number = courseNumber;
   }
   
   public void setCourseTitle(String courseTitle) {
      title = courseTitle;
   }
   
   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
   public String getCourseNumber() {
      return number;
   }
   
   public String getCourseTitle() {
      return title;
   }
   
   // TODO: Define printInfo()
   public void printInfo() {
      System.out.println("Course Information:");
      System.out.println("   Course Number: " + number);
      System.out.println("   Course Title: " + title);
   }
}
