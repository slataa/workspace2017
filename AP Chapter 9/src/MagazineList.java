//*******************************************************************
//  MagazineList.java       Author: Lewis/Loftus/Cocking
//
//  Represents a collection of magazines.
//*******************************************************************

public class MagazineList
{
   private ListNode list;

   //----------------------------------------------------------------
   //  Sets up an empty list of magazines.
   //----------------------------------------------------------------
   public MagazineList()
   {
      list = null;
   }

   //----------------------------------------------------------------
   //  Creates a new MagazineNode object and adds it to the end of
   //  the linked list.
   //----------------------------------------------------------------
   public void add (Magazine mag)
   {

      ListNode node = new ListNode (mag, null);
      ListNode current;

      if (list == null)
         list = node;
      else
      {
         current = list;
         while (current.getNext() != null)
            current = current.getNext();
         current.setNext(node);
      }
   }

   //----------------------------------------------------------------
   //  Returns this list of magazines as a string.
   //----------------------------------------------------------------
   public String toString ()
   {
      String result = "";
      ListNode current = list;

      while (current != null)
      {
         result += current.getValue().toString() + "\n";
         current = current.getNext();
      }

      return result;
   }
}
