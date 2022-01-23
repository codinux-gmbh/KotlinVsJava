package net.codinux.kotlin.model

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Person(
  var name: String,
  val dayOfBirth: LocalDate,
  var address: Address? = null
) {

  override fun toString(): String {
    return "$name: ${DateTimeFormatter.ISO_DATE.format(dayOfBirth)} ($address)"
  }

}