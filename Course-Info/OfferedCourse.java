public class OfferedCourse extends Course {
   // TODO: Declare private fields
   private String instructor;
   private String classLocation;
   private String time;

   // TODO: Define mutator methods -
   //      setInstructorName(), setLocation(), setClassTime()
   public void setInstructorName(String instructorName) {
      instructor = instructorName;
   }
   
   public void setLocation(String location) {
      classLocation = location;
   }
   
   public void setClassTime(String classTime) {
      time = classTime;
   }
   
   // TODO: Define accessor methods -
   //      getInstructorName(), getLocation(), getClassTime()
   public String getInstructorName() {
      return instructor;
   }
   
   public String getLocation() {
      return classLocation;
   }
   
   public String getClassTime() {
      return time;
   }

}