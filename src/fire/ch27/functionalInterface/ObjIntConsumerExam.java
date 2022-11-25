package src.fire.ch27.functionalInterface;

import java.util.function.ObjIntConsumer;

/* ObjIntConsumer */
class ObjIntConsumerExam {
    public static void main(String[] args) {
        ObjIntConsumer<String> c = (s, i) -> System.out.println(i + ". " + s);
        int n = 1;
        c.accept("Red", n++);
        c.accept("Black", n++);
        c.accept("Pink", n++);
    }
}
