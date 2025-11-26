public class MultipleInheritanceDemo implements A, B {

    @Override
    public void showA() {
        System.out.println("Feature from Interface A");
    }

    @Override
    public void showB() {
        System.out.println("Feature from Interface B");
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
        obj.showA();
        obj.showB();
    }
}