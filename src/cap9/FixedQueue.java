package cap9;

class FixedQueue implements ICharQ {
    private char q[];
    private int putloc, getloc;

    public FixedQueue(int size) {
        q = new char[size];
        putloc = getloc = 0;
    }

    public void put(char ch) throws QueueFullException {
        if (putloc == q.length)
            throw new QueueFullException(q.length);
        q[putloc++] = ch;
    }

    public char get() throws QueueEmptyException {
        if (getloc == putloc)
            throw new QueueEmptyException();
        return q[getloc++];
    }
}
