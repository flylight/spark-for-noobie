package org.ar.spark.noobie;

import org.ar.spark.noobie.controllers.DataEndpoint;

/**
 * Application main class. Create Spark Java endpoints.
 */
public class RunWebApi {

	public static void main(String[] args) {
		new DataEndpoint();
	}
}
