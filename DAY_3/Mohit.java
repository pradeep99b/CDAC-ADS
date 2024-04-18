public class Mohit{
    
  static Node head;
   
   static class Node{
            int data;
            Node link;
             
         Node(int data){
                
              this.data=data;
              this.link=null;
          }    
          
    }


      static void display(){
          
            Node ref = head;
          while(ref != null){
                System.out.print(ref.data+"---->");
                     ref = ref.link; 
              }
 

      }
   
  public static void main(String args[]){
        
         LinkList2 l1 = new LinkList2();
         l1.head = new Node(5);
          Node two = new Node(6);
          Node three = new Node(7);
          
          l1.head.link = two;
          two.link = three;  
          
        l1.display();
     
         //inserting element
           
         Node before_one = new Node(4);
               
         before_one.link = l1.head;
         head = l1.before_one;
        l1.display();

                                      }

}