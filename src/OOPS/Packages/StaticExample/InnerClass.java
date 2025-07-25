package OOPS.Packages.StaticExample;
// outside classes cannot be static note
// only inner classes is static
public class InnerClass {
    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kanhaiya");
        Test b = new Test("Rahul");

    }
}
