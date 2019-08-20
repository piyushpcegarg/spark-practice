package com.piyushpcegarg;

import org.apache.spark.sql.SparkSession;

public class JavaSparkVersion {

    public static void main(String[] args) {

        SparkSession spark = SparkSession
                .builder()
                .appName("Java Spark Version")
                .getOrCreate();

        System.out.println(spark.version());
    }
}
