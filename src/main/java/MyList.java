public interface MyList <T> {
    public void add(T t);
    public boolean contains(T t);
    public boolean remove(T t);
    public T remove(int index);
    public T get(int index);
    public int firstIndexOf(T t);
    public int size();
}
