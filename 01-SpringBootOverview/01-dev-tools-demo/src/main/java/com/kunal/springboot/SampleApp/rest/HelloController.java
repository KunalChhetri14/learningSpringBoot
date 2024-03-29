package com.kunal.springboot.SampleApp.rest;

import com.kunal.springboot.SampleApp.SampleAppApplication;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @Value("owner.name")
  private String name;

  @Value("owner.age")
  private String age;

  @GetMapping("/")
  public String sayHello() {
    System.out.println("THe name is : "+ name);
    return "Hellow Worlddd";
  }

  @GetMapping("/open")
  public String open() {
    System.out.println("Open :::: ");
    return "Open app";
  }

  @GetMapping("/workout")
  public String workout() {
    return "Workout routine for age: "+ age;
  }
}
