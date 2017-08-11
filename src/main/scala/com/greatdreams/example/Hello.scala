package com.greatdreams.example

import org.slf4j.LoggerFactory

object Hello {
  val logger = LoggerFactory.getLogger(Hello.getClass)
  
  def main(args: Array[String]): Unit = {
    logger.info("Hello, world!")
  }
}
