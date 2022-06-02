package pro.sky.java.course2.store.data;

import java.util.Objects;

public class Item {
    int id;

    public Item(int itemId) {
        this.id = itemId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void setId(int id) {
        this.id = id;
    }
}
