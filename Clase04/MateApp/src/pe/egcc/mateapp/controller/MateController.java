package pe.egcc.mateapp.controller;

import pe.egcc.mateapp.service.MateService;

public class MateController {

  public long calcFactorial(int num) {
    return MateService.calcFactorial(num);
  }
  
}
