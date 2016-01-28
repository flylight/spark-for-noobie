package org.ar.spark.noobie.controllers;

import static spark.Spark.get;

/**
 * REST endpoint built on Spark Java.
 * Used to declare "/data" endpoint that will be used to retrieve processed data.
 */
public class DataEndpoint {

  public DataEndpoint(){
    get("/data", (request, response) -> "TEST");
  }

}
