public interface Lockable{
    public void setLockable(int lock);

    void setKey(int keyInput, int newKey);

    void lock(keyInput);

    void unlock(keyInput);

    boolean locked();



}
