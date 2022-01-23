package net.codinux.kotlin;

import java.util.Optional;
import java.util.function.Supplier;

public class LambdasVsClosures {

    public void randomize(Supplier<Integer> numberSupplier) {
        // ...
    }

    public void canChangeVariables() {
        int i = 0;

        randomize(() -> {
            return ++i; // compile error, cannot change surrounding variable i
        });
    }

    public String canCallReturnInside(Optional<String> name) {
        // yeah, not the most senseful code, I know
        name.ifPresent(notNullName -> {
            return notNullName; // compile error, not possible in Java
        });

        return "Name not set";
    }

}