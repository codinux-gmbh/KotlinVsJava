package net.codinux.kotlin

import net.codinux.kotlin.model.Company
import net.codinux.kotlin.model.Person
import net.codinux.kotlin.model.State


class `when` {

  fun canBeUsedAsExpression_SimpleSyntax(lampState: State): String {
    return when (lampState) {
      State.On -> "Lamp is on"
      State.Off -> "Lamp is off"
    }

    // no 'case' and 'break' required
    // each line represents one condition / branch, condition and statement are separated by '->', for longer statements simply use '{ }'
    // as all possible cases are covered, we don't need a default- / else branch (see below)
    // when can be used as expression -> the 'return' can be lifted out of all branches
    // basically the same as Java 12 introduced in switch expressions
  }

  /**
   * In Java, the switch statement can only be used with primitives and their boxed types, enums, and the String class. In contrast, Kotlin allows us to use the when block with any built-in or user-defined type.

  In addition, it is not required that the cases are constant expressions as in Java. Cases in Kotlin can be dynamic expressions that are evaluated at runtime. For example, cases could be the result of a function as long as the function return type is compatible with the type of the when block argument.
   */
  fun powerfulConditions(clientId: Long, client: Any): String {
    return when { // when can be used without an argument
      clientId < 10 -> "We can do range checks and other comparisons,"
      client.javaClass.simpleName.isNullOrBlank() -> "call methods,"
      client is Person -> "check for types,"
      clientId == 17L || clientId !in 30..40 || client is Company -> "multiple cases on one line"
      else -> "But when has to be exhaustive, therefore an else branch for 'all other cases' (equals 'default' in Java switch statements) is required"
    }
  }

}