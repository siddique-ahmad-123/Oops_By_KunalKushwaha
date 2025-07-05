package access;

public class Objectdemo {

    int num;

    public Objectdemo(int num){
        this.num = num;
    }


    //will be explain in diff lect.
    //it is just a random integer value
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public String toString() {
        return super.toString();
    }

    //called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
