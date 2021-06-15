public interface MyList <T> {
    public void add(T t);
    public boolean remove(T t);
    public boolean remove(int index);
    public T get(int index);
    public int firstIndexOf(T t);
    public int size();
}
