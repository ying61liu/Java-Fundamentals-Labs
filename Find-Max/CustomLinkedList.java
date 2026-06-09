public class CustomLinkedList {
   
   public static int findMax(IntNode headObj) {
      /* Type your code here */   
      if (headObj.getNext() == null) {
         return -99;
      }

      IntNode tmpNode = headObj.getNext();
      int maxVal = tmpNode.getNodeData();
         
      while (tmpNode != null) {
         if (tmpNode.getNodeData() > maxVal) {
            maxVal = tmpNode.getNodeData();
         }
         tmpNode = tmpNode.getNext();
      }
           
      return maxVal;
   }
   
   public static void main(String[] args) {
      IntNode headObj; 
      IntNode currObj;
      IntNode lastObj;
      int i; 
      int max;
      
      // Create head node
      headObj = new IntNode(-1); 
      lastObj = headObj;
      
      // Add nodes to the list
      for (i = 0; i < 20; ++i) { 
         currObj = new IntNode(i);         
         lastObj.insertAfter(currObj); 
         lastObj = currObj;
      }    
      
      /**
      currObj = headObj;
      for (i = 0; i < 20; ++i) { 
         currObj.printNodeData();
         System.out.print(" ");
         currObj = currObj.getNext();
      }
      */
      
      max = findMax(headObj);
      System.out.println(max);
   }
}