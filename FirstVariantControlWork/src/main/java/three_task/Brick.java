package three_task;

public class Brick implements Breakable{
    @Override
    public void breakObject() {
        System.out.println("The brick has been broken.");
    }
}
