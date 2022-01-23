package net.codinux.kotlin


class LambdasVsClosures {

  fun randomize(numberSupplier: () -> Int) {
    // ...
  }

  fun canChangeVariables() {
    var i = 0

    randomize {
      ++i // can change the value of surrounding variable i
    }
  }

  fun canCallReturnInside(name: String?): String {
    // yeah, not the most senseful code, I know
    name?.let {
      return it // not possible in Java
    }

    return "Name not set"
  }

}