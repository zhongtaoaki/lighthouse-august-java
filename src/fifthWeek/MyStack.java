package fifthWeek;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    public List<Integer> list;

    public MyStack(){
        list = new ArrayList<>();
    }

    public Integer pop() {
        return list.remove(list.size() - 1);
    }

    public void push(Integer i) {
        list.add(i);
    }
}
