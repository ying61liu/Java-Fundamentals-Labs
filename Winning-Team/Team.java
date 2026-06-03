public class Team {
   // TODO: Declare private fields - name, wins, losses
   private String name;
   private int wins;
   private int losses;
   
   
   // TODO: Define mutator methods - 
   //       setName(), setWins(), setLosses()
   public void setName(String userStr) {
      name = userStr;
   }
   
   public void setWins(int userWins) {
      wins = userWins;
   }
   
   public void setLosses(int userLosses) {
      losses = userLosses;
   }
   
   // TODO: Define accessor methods - 
   //       getName(), getWins(), getLosses()
   public String getName() {
      return name;
   }
   
   public int getWins() {
      return wins;
   }
   
   public int getLosses() {
      return losses;
   }
   
   // TODO: Define getWinPercentage()
   public double getWinPercentage() {
      return (double) wins / (wins + losses);
   }
   
   // TODO: Define printStanding()
   public void printStanding() {
      if (this.getWinPercentage() >= 0.5) {
         System.out.printf("Win percentage: %.2f\n", this.getWinPercentage());
         System.out.println("Congratulations, Team " + name + " has a winning average!");
      }
      else {
         System.out.printf("Win percentage: %.2f\n", this.getWinPercentage());
         System.out.printf("Team " + name + " has a losing average.");
      }
   }
   
}