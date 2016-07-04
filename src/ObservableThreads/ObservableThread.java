package ObservableThreads;

abstract class ObservableThread implements Observable, Runnable {
    final int id;
    private String text = "";
    private Status status = Status.NOTSTARTED;
    private Type type = Type.DEFAULT;

    public ObservableThread(int id){
        this.id = id;
    }

    @Override
    public synchronized  int getID() {
        return id;
    }

    @Override
    public synchronized String getText() {
        return text;
    }

    public synchronized void setText(String text){
        this.text = text;
    }

    @Override
    public synchronized Status getStatus() {
        return status;
    }

    public synchronized void setStatus(Status status){
        this.status = status;
    }

    @Override
    public synchronized Type getType() {
        return type;
    }

    public synchronized void setType(Type type){
        this.type = type;
    }
}
