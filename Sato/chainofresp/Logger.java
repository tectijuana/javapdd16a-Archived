abstract class Logger {

    public static final int ERR = 3;
    public static final int NOTICE = 5;
    public static final int DEBUG = 7;
    private int mask;

    // The next element in the chain of responsibility
    private Logger next;

    public Logger(int mask) {
        this.mask = mask;
    }

    public Logger setNext(Logger l) {
        next = l;
        return l;
    }

    public void message(String msg, int priority) {
        if (priority <= mask) {
            writeMessage(msg);
        }
        if (next != null) {
            next.message(msg, priority);
        }
    }
   
    abstract protected void writeMessage(String msg);

}
