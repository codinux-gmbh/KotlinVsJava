package net.codinux.kotlin

import java.io.File
import java.io.InputStream


class Files {

  private fun readFile(file: File) {
    val lines = file.readLines()

    val text = file.readText()
  }

  private fun readInputStream(inputStream: InputStream): String {
    return inputStream.bufferedReader().readText()
  }

}