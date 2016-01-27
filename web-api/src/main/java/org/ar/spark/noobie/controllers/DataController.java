package org.ar.spark.noobie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by arymar on 27.01.16.
 */
@Controller
public class DataController {

  @RequestMapping("/getData")
  @ResponseBody
  public String getData(){
    return "test";
  }

}
