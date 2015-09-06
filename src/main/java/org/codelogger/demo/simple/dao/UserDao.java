package org.codelogger.demo.simple.dao;

import org.codelogger.core.context.stereotype.Dao;
import org.codelogger.demo.simple.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dao
public class UserDao {

  private Logger logger = LoggerFactory.getLogger(getClass());

  public User getUser(final Long id) {

    logger.debug("getUser by id[{}]", id);
    return null;
  }
}
