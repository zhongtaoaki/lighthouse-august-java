package fifthWeek;

import java.util.ArrayList;
import java.util.List;

//多态和泛型
//多态： 数据类型一致，但是算法不一致
//泛型： 数据类型不一致，但是算法一致
public class MyStack<T> {

    public List<T> list;

    public MyStack(){
        list = new ArrayList<>();
    }

    public T pop() {
        return list.remove(list.size() - 1);
    }

    public void push(T i) {
        list.add(i);
    }
}
