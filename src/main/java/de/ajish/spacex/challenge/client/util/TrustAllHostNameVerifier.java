package de.ajish.spacex.challenge.client.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 *
 * @author Ajish Asafali
 */
public class TrustAllHostNameVerifier implements HostnameVerifier {

    public TrustAllHostNameVerifier() {
    }

    @Override
    public boolean verify(String string, SSLSession ssls) {
        return true;
    }

}

