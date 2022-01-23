package net.codinux.kotlin;

import java.util.Locale;

public class Strings {

    public void isNotEmpty() {
        String name = "Mahatma";

        if (name.isEmpty() == false) {

        }
    }

    public void isNullOrBlank() {
        String name = null;

        if (name == null || name.isBlank()) {

        }
    }

    public void ignoreCase() {
        String name = "Mahatma";

        System.out.println(name.toLowerCase(Locale.ROOT).contains("Atma".toLowerCase(Locale.ROOT)));
    }

    public void encodeToByteArray() {
        String name = "Mahatma";

        // TODO:
        // System.out.println(name.encodeToByteArray());
    }

}