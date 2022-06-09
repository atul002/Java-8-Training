package MethodReferences;
class Sample {
    Sample (String s) {
        System.out.println("Sample Constructor: "+s);
    }
}
interface Intrf {
    public Sample get(String s);
}
public class SampleConstructor {
    public static void main(String[] args) {
        Intrf i = Sample::new;
        Sample s1 = i.get("Atul");
        Sample s2 = i.get("Aman");
    }
}
