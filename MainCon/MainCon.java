public class MainCon {
    private int value1;
    private int value2;

    public MainCon(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public MainCon(int value1) {
        this.value1 = value1;
        this.value2 = 0;
    }

    public MainCon() {
        this.value1 = 0;
        this.value2 = 0;
    }

    public static void main(String[] args) {
        MainCon obj1 = new MainCon(1, 2);
        MainCon obj2 = new MainCon(3);
        MainCon obj3 = new MainCon();

        System.out.println("Object 1: value1=" + obj1.value1 + ", value2=" + obj1.value2);
        System.out.println("Object 2: value1=" + obj2.value1 + ", value2=" + obj2.value2);
        System.out.println("Object 3: value1=" + obj3.value1 + ", value2=" + obj3.value2);
    }
}
