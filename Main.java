class ListNode {
  int value = 0;
  ListNode next;
  ListNode(int value){
    this.value = value;
  }
}

class Main {

  // Given the head of a Singly LinkedList, reverse the LinkedList. Write a function to return the new head of the reversed LinkedList.



    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

  public static void main(String[] args) {
        ListNode head = new ListNode(2);
    head.next = new ListNode(4);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(8);
    head.next.next.next.next = new ListNode(10);
    ListNode result = (Main.reverseList(head));
    while(result != null){
          System.out.println(result.value  + " ");
result = result.next;
    }
 }
}