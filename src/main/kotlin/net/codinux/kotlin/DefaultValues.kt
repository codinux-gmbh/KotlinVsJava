package net.codinux.kotlin

import net.codinux.kotlin.model.ResilientHandler
import java.time.Duration


class DefaultValues {

  private fun createResilientHandler(maxAttempts: Int = 20, waitBeforeRetry: Duration = Duration.ofMillis(50), maxConcurrentCalls: Int = 25,
                             serviceName: String = "ResilientHandler"): ResilientHandler {
    return ResilientHandler(maxAttempts, waitBeforeRetry, maxConcurrentCalls, serviceName)
  }

  fun request(): String? {
    return createResilientHandler(25, serviceName = "ElasticsearchRequester").handle { "Success!" }
  }

}