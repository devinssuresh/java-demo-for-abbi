package com.briandevins.demoforabbi.random;

import java.util.Random;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
  private static final Random RANDOM = new Random();

  @RequestMapping(path = "/random", method = RequestMethod.GET)
  public int getRandom() {
    return RANDOM.nextInt();
  }

}
