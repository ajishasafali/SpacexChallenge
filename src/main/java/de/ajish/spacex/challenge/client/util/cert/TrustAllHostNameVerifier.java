package de.ajish.spacex.challenge.client.util.cert;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 *
 * @author Ajish Asafali
 */
public class TrustAllHostNameVerifier implements HostnameVerifier {

    public TrustAllHostNameVerifier() {
    }

    /**
     * verify all hosts
     * @param string
     * @param ssls
     * @return
     */
    @Override
    public boolean verify(String string, SSLSession ssls) {
        return true;
    }

}

