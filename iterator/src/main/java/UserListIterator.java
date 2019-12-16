import java.util.List;

public class UserListIterator<E> implements Iterator {
    int position = 0;
    List<E> items;

    public UserListIterator(List<E> items) {
        this.items = items;
    }

    public E next() {
        E item = items.get(position);
        position++;
        return item;
    }

    public boolean hasNext() {
        if(items.size() <= position || items.get(position) == null) return false;
        return true;
    }
}
