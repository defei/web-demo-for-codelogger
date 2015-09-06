package org.codelogger.demo.simple.service;

import org.codelogger.core.context.stereotype.Autowired;
import org.codelogger.core.context.stereotype.Service;
import org.codelogger.demo.simple.dao.UserDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class UserService {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @Autowired
  private UserDao userDao;

  public void getUserById(final Long userId) {

    logger.debug("getUserById by id[{}]", userId);
    userDao.getUser(userId);
  }
}
