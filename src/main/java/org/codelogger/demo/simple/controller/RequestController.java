package org.codelogger.demo.simple.controller;

import org.codelogger.web.context.stereotype.Controller;
import org.codelogger.web.context.stereotype.RequestMapping;

@Controller
@RequestMapping("request")
public class RequestController {

  @RequestMapping("header")
  public String showHeaders() {

    return null;
  }
}
