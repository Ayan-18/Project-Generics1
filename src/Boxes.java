public class Boxes<T, E> {
    private T box;
    private E obj;

    public Boxes(T box, E obj) {
        this.box = box;
        this.obj = obj;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }

    public E getOb() {
        return obj;
    }

    public void setOb(E obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Boxes{" +
                "box=" + box +
                "; boxType= " + box.getClass().getName() +
                ", obj=" + obj +
                "; objType= " + obj.getClass().getName() +
                '}';
    }
}