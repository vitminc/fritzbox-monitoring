package org.extensions.dsl;

import com.bitplan.fritzbox.FritzBoxSession;
import com.bitplan.fritzbox.Fritzbox;

/**
 * The Class BaseFritzBox.
 */
public class BaseFritzBox implements Fritzbox {
  
  private final String username;
  private final String password;
  private final String url;
  
  /**
   * Instantiates a new base fritz box.
   *
   * @param url
   *          the url
   * @param username
   *          the username
   * @param password
   *          the password
   */
  public BaseFritzBox(String url, String username, String password) {
    this.username = username;
    this.password = password;
    this.url = url;
  }

  /**
   * Login.
   *
   * @return the fritz box session
   */
  public FritzBoxSession login() {
    BaseFritzBoxSession session = new BaseFritzBoxSession(this);
    session.login();
    return session;
  }
  
  /**
   * Gets the url.
   *
   * @return the url
   */
  @Override
  public String getUrl() {
    return url;
  }
  
  /**
   * Gets the username.
   *
   * @return the username
   */
  @Override
  public String getUsername() {
    return username;
  }
  
  /**
   * Gets the password.
   *
   * @return the password
   */
  @Override
  public String getPassword() {
    return password;
  }

}
