package three_task;

public class LambdaBreakable {
    public static void main(String[] args) {
//        Breakable glass = () -> System.out.println("The glass has been broken.");
//        Breakable brick = () -> System.out.println("The brick has been broken.");
//        Breakable egg = () -> System.out.println("The egg has been broken.");
//
//        glass.breakObject();
//        brick.breakObject();
//        egg.breakObject();

        Glass glass = new Glass();
        glass.breakObject();

        Egg egg = new Egg();
        egg.breakObject();

        Brick brick = new Brick();
        brick.breakObject();
    }
}
