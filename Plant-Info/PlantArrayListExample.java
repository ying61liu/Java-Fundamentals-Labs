import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PlantArrayListExample {

   // TODO: Define a printArrayList method that prints an ArrayList of plant (or flower) objects                                                       
   public static void printArrayList(ArrayList<Plant> plantList) {
      for (int i = 0; i < plantList.size(); i++) {
         System.out.println("Plant " + (i + 1) + " Information: ");
         plantList.get(i).printInfo();
         System.out.println();
      }
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String input;
      // TODO: Declare an ArrayList called myGarden that can hold object of type plant
      ArrayList<Plant> myGarden = new ArrayList<>();
      
      // TODO: Declare variables - plantName, plantCost, flowerName, flowerCost, colorOfFlowers, isAnnual
      String plantName, plantCost;
      String flowerName, flowerCost, colorOfFlowers; 
      boolean isAnnual;
      
      input = scnr.next();
      while(!input.equals("-1")){
         // TODO: Check if input is a plant or flower
         //       Store as a plant object or flower object
         //       Add to the ArrayList myGarden
         if (input.equals("plant")) {
            plantName = scnr.next();
            plantCost = scnr.next();
            
            Plant myPlant = new Plant();
            myPlant.setPlantName(plantName);
            myPlant.setPlantCost(plantCost);
            
            myGarden.add(myPlant);
         }
         else {
            flowerName = scnr.next();
            flowerCost = scnr.next();
            isAnnual = scnr.nextBoolean();
            colorOfFlowers = scnr.next();
            
            Flower myFlower = new Flower();
            myFlower.setPlantName(flowerName);
            myFlower.setPlantCost(flowerCost);
            myFlower.setPlantType(isAnnual);
            myFlower.setColorOfFlowers(colorOfFlowers);
            
            myGarden.add(myFlower);
         }
         
         input = scnr.next();
      }
      
      // TODO: Call the method printArrayList to print myGarden
      printArrayList(myGarden);
   }
}
