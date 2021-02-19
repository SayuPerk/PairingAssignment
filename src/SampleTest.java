public class SampleTest {

    public String printHelloWorld() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SampleTest test = new SampleTest();
        System.out.println(test.printHelloWorld());
    }
}
