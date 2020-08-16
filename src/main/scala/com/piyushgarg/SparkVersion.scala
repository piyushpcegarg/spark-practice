package com.piyushgarg

import org.apache.spark.sql.SparkSession

object SparkVersion {

  def main(args: Array[String]): Unit = {

    val spark = SparkSession
      .builder()
      .appName("Spark Version")
      .getOrCreate()

    println("Spark Version: " + spark.version)
  }

}
