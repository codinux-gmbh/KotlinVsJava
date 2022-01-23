package net.codinux.kotlin;

import net.codinux.kotlin.model.State;

public class when {

    public String canBeUsedAsExpression_SimpleSyntax(State lampState) {
        return switch (lampState) { // this is valid starting from Java 12
            case State.On -> "Lamp is on";
            case State.Off -> "Lamp is off";
        }
    }

    public String powerfulConditions(Long clientId, Object client) {
        return "All this is not possible in Java!";
    }

}