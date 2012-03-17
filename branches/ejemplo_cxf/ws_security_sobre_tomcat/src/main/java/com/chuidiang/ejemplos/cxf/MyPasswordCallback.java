package com.chuidiang.ejemplos.cxf;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.ws.security.WSPasswordCallback;

public class MyPasswordCallback implements CallbackHandler {

   public void handle(Callback[] callbacks) throws IOException,
         UnsupportedCallbackException {

      WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

      if (pc.getIdentifier().equals("joe")) {
         // set the password on the callback. This will be compared to the
         // password which was sent from the client.
         pc.setPassword("password");
      }
   }
}
