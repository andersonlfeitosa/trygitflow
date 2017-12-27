package com.andersonlfeitosa.buildpipeline;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Endpoint responsável por exibir mensagem. 
 * 
 * @author Anderson Lobo Feitosa - andersonlf@gmail.com
 * @since 2017-12-11
 * @version 1.0.0
 */
@RestController
public class ApiController5 {

  /**
   * Expõe método HTTP GET para exibição de mensagem.
   *  
   * @return A mensagem.
   */
  @RequestMapping("/api5")
  public String sayHello() {
    return ("Hello World, this is a SpringBoot Microservice");
  }

}
