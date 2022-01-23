package net.codinux.kotlin.model

import java.time.Duration


class ResilientHandler(
  val maxAttempts: Int = 20,
  val waitBeforeRetry: Duration = Duration.ofMillis(50),
  val maxConcurrentCalls: Int = 25,
  val serviceName: String = "ResilientHandler"
) {

  fun <T> handle(action: () -> T?): T? {
    return action()
  }

}