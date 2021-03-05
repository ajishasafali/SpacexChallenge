package de.ajish.spacex.challenge.client.util.cert;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 *
 * @author Ajish Asafali
 */
public class TrustAllTrustManager implements X509TrustManager {

    public TrustAllTrustManager() {
    }

    @Override
    public void checkClientTrusted(X509Certificate[] xcs, String string) throws CertificateException {
        System.out.println("TrustAllTrusManger.checkClientTrusted invoked!");
        //Accept all
    }

    @Override
    public void checkServerTrusted(X509Certificate[] xcs, String string) throws CertificateException {
        System.out.println("TrustAllTrustManger.checkServerTrusted invoked!");
        //Accept all
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        System.out.println("TrustAllTrustManger.X509Certificate invoked!");
        return null;
    }

    public static TrustManager[] get() {
        return new TrustManager[]{new TrustAllTrustManager()};
    }

    public static void initSSLContext() throws Exception {
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(final String s, final SSLSession sslSession) {
                System.out.println("HostnameVerifier.verify invoked!");
                return true;
            }
        });

        TrustManager[] trustAllCerts = new TrustManager[]{new TrustAllTrustManager()};

        SSLContext ctx = SSLContext.getInstance("TLS");
        ctx.init(null, trustAllCerts, null);
        SSLContext.setDefault(ctx);

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new java.security.SecureRandom());

        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
    }
}
