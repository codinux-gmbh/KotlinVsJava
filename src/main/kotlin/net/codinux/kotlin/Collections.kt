package net.codinux.kotlin

import net.codinux.kotlin.model.Person
import java.time.LocalDate


class Collections {

  fun count(clientIds: List<Long>): Int {
    return clientIds.count { it > 10 }
  }


  fun map(clientIds: List<Long>): List<String> {
    return clientIds.map { it.toString() }
  }

  fun mapNotNull(clientIds: List<Long>): List<String> {
    return clientIds.mapNotNull { it.toString() }
  }


  fun joinToString(clientIds: List<Long>) {
    println(clientIds.joinToString()) // prints e.g. "7, 19, 33, 56"
  }

  fun joinToStringWithOptions(clientIds: List<Long>) {
    println(clientIds.joinToString("; ", "clientIds: ", ".") { "ID: $it" }) // e.g. "clientIds: ID: 7; ID: 19; ID: 33."
  }


  fun instanceOf(clientIds: List<Number>): List<Long> {
    return clientIds.filterIsInstance<Long>()
  }


  fun groupBy(persons: List<Person>): Map<LocalDate, List<Person>> {
    return persons.groupBy { it.dayOfBirth }
  }

  fun toMap(persons: List<Person>): Map<String, Person> {
    return persons.associateBy { it.name }
  }

  fun toMapMapped(persons: List<Person>): Map<LocalDate, String> {
    return persons.associate { it.dayOfBirth to it.name }
  }

}