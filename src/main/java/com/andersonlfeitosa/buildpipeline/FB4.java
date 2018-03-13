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
public class FB4 {

  /**
   * Expõe método HTTP GET para exibição de mensagem.
   * 
   * @return A mensagem.
   */
  @RequestMapping("/fb4")
  public String sayHello() {
    return ("Ok Novo Return");
  }

  /**
   * Expõe método HTTP GET para exibição de mensagem.
   * 
   * @return A mensagem.
   */
  @RequestMapping("/funcionalidade2")
  public String sayHello2() {
    return ("Hello World, this is a SpringBoot Microservice");
  }

}
