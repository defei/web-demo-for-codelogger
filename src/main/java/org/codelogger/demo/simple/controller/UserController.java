package org.codelogger.demo.simple.controller;

import javax.servlet.http.HttpServletRequest;

import org.codelogger.core.context.stereotype.Autowired;
import org.codelogger.demo.simple.service.UserService;
import org.codelogger.web.context.stereotype.Controller;
import org.codelogger.web.context.stereotype.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("users")
public class UserController {

  @Autowired
  private UserService userService;

  @RequestMapping
  public String welcome(final HttpServletRequest request) {

    logger.info("OK");
    userService.getUserById(1L);
    return "index";
  }

  @RequestMapping("{userId}")
  public String getUserById(final Long userId) {

    logger.info("OK");
    userService.getUserById(userId);
    return "detail";
  }

  @Override
  public String toString() {

    if (userService != null) {
      userService.getUserById(1L);
      return "OK";
    } else {
      return super.toString();
    }
  }

  private Logger logger = LoggerFactory.getLogger(getClass());

}
