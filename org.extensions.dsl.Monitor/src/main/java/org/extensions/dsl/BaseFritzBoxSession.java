package org.extensions.dsl;

import com.bitplan.fritzbox.FritzBoxSession;
import com.bitplan.fritzbox.FritzBoxSessionImpl;
import com.bitplan.fritzbox.Fritzbox;

/**
 * The Class BaseFritzBoxSession.
 */
public class BaseFritzBoxSession extends FritzBoxSessionImpl {

  /**
   * Instantiates a new base fritz box session.
   *
   * @param pFritzbox
   *          the fritzbox
   */
  public BaseFritzBoxSession(Fritzbox pFritzbox) {
    super(pFritzbox);
  }
  
  /**
   * Login.
   *
   * @return the fritz box session
   */
  @Override
  protected FritzBoxSession login() {
    return super.login();
  }
}
