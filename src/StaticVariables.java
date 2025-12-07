
public class StaticVariables {
    static int num = 10;
    int num1=100;
    int y = 20;

    public StaticVariables() {

    }

    public static void main() {
        System.out.println(num);
        System.out.println(StaticVariables.num);


    }

    public void method() {
        int n = num;
        int n2 = StaticVariables.num;
    }

    public static void method2() {
        StaticVariables staticVariables = new StaticVariables();
        StaticVariables staticVariables1 = new StaticVariables();

        staticVariables.num = 188;
        staticVariables.y = 100;
        System.out.println(staticVariables1.num + " left static variable ::; Right instance variable" + staticVariables1.y + " first object" + staticVariables.y);

    }

    public static void main(String[] args) {
        StaticVariables.method2();
    }
}
