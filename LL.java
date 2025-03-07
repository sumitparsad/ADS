class Ln{
    int val;
    Ln next;
    Ln(int x){
        val=x;
        next=null;
    }
}

public class LL {
    // Detect if a acycle is present in ll,if present remove it.
    // Approach:Floyds cycle Algo
    // Use two pointers,slow move one step,fast move two steps.

    // if tehy meet,a cycle exist.
    // to remove the cycle
    // start the pointer from the head

    // move the pointers at the same speed until they meet ata the start of the 
    // find the last node and remove the cycle.

    public static boolean hascycle(Ln head) {
        Ln slow=head,fast=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)return true;
        }
        return false;
    }
    public static void remCycle(Ln head) {
        Ln slow=head,fast=head;
        boolean cycleExi=false;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycleExi=true;
                break;
            }
        
        }
        if(!cycleExi)return;
        slow=head;
        while(slow.next!=fast.next){
            slow=slow.next;
            fast=fast.next;

        }
        fast.next=null;

    }
    public static void main(String[] args) {
        Ln head=new Ln(1);
        head.next=new Ln(2);
        head.next.next=new Ln(3);
        head.next.next.next=new Ln(4);
        head.next.next.next.next=head.next;
        System.out.println("C D"+ hascycle(head));
        remCycle(head);
        System.out.println("C R"+ hascycle(head));
    }

}
// 141 142 21