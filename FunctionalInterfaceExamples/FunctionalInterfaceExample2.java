package FunctionalInterfaceExamples;

    @FunctionalInterface
    interface A {
        public abstract void m1();
    }

    class Demo implements A {
        public void m1() {
            System.out.println("Demo");
        }
    }

    class LegacyApproach {
        public static void main(String[] args) {
            A a = new Demo();
            a.m1();
        }
    }


    class LambdaApproach {
        public static void main(String[] args) {
            A a = () -> {
                System.out.println("Demo using Lambda");
            };
            a.m1();
        }
    }

