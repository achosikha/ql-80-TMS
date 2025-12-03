package lesson_19_updates.defmethod;

public class BImpInterface implements DefaultImplementation{
    @Override
    public void getMSG() {

    }

    @Override
    public void run() {

    }

    @Override
    public void unnecessaryMethod() {
        DefaultImplementation.super.unnecessaryMethod();
    }

    @Override
    public void setMsg() {
        DefaultImplementation.super.setMsg();
    }
}
