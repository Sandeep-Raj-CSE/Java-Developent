import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class JavaQueueInterface {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(40);



//        System.out.println(q);
//
//        System.out.println(q.poll());
//        System.out.println(q);
//
//
//        System.out.println(q.peek());
//        System.out.println(q);


        while (!q.isEmpty()){
            System.out.println(q.poll());
        }


        System.out.println(q.poll());


// lEARN DEQUE

        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(2000);
        dq.offerFirst(300);

        dq.offerLast(4500);

        System.out.println(dq);


        System.out.println(dq.remove());

        System.out.println(dq.peek());

      // Stack and queue through Arraydeque

      ArrayDeque<Integer> st = new ArrayDeque<>();

      st.push(12);
      st.push(14);
      st.push(16);

        System.out.println(st);
        st.pop();
        System.out.println(st);

    }
}
