package org.ar.spark.noobie.controllers;

import org.ar.spark.noobie.services.DataService;

import static spark.Spark.get;

/**
 * REST endpoint built on Spark Java.
 * Used to declare "/data" endpoint that will be used to retrieve processed data.
 */
public class DataEndpoint {

  private DataService dataService = new DataService();

  public DataEndpoint(){
    get("/data", (request, response) -> dataService.countWords());
  }

}
