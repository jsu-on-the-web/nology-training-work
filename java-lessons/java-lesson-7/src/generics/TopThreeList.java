import java.util.ArrayList;

public class TopThreeList<T> {
    // Capital T stands for type!
	ArrayList<T> favSomething;

    public TopThreeList(T first, T second, T third) {
        favSomething = new ArrayList<T>();
        favSomething.add(first);
        favSomething.add(second);
        favSomething.add(third);
    }
}
