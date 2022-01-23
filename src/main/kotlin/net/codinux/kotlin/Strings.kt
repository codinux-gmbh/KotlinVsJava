package net.codinux.kotlin


class Strings {

  fun isNotEmpty() {
    val name = "Mahatma"

    if (name.isNotEmpty()) {

    }
  }

  fun isNullOrBlank() {
    val name: String? = null

    if (name.isNullOrBlank()) { // can even be called on null

    }
  }

  fun ignoreCase() {
    val name = "Mahatma"

    println(name.contains("Atma", ignoreCase = true)) // prints true
    // also works for .startsWith(), endsWidth(), .replace(), ...
    // "ignoreCase = " can be left away, just to make code clearer
  }

  fun encodeToByteArray() {
    val name = "Mahatma"

    println(name.encodeToByteArray())
  }

}