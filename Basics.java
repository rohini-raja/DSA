import java.util.*;
class Data{
    public Integer num;
    public String name;
    Data(int _num, String _name){
        this.num = _num;
        this.name = _name;
    }
}
public class Basics{
    /**
     * @param args
     */
    public static void main(String[] args){
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(14);
        alist.add(13);
        System.out.println(alist);
        System.out.println("the size of the arraylist is:" + alist.size());
        System.out.println("the element at index 1 is:" + alist.get(1));
        
        LinkedList<Integer> ll = new LinkedList<>(); //create a new linkedlist
        ll.add(1);
        ll.add(14);
        ll.addLast(15);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);

        //Last in first out
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.pop();
        System.out.println(st);
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st);
        st.pop();
        System.out.println(st);

       // Vector class - Thread safe
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v);
        v.remove(1);
        v.capacity();
        System.out.println(v);
        System.out.println(v.capacity());
         
        //Sets
        //HashSet - stores unique elements in random order
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(1);
        System.out.println(hs);
        for(var idx : hs){
            System.out.println(idx);
        }
        //TreeSets - stores elements in sorted order
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(1);
        System.out.println("Tree Set");
        System.out.println(ts);
        return;
    }
}