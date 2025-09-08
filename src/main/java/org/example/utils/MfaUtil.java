package org.example.utils;

import com.warrenstrange.googleauth.GoogleAuthenticator;
import org.example.config.EnvConfig;

/**
 * @author iModupsy
 * @created 08/09/2025
 */
public class MfaUtil {

    public static int generateMfaCode() {
        final String secret = EnvConfig.get("MFA_SECRET");
        final GoogleAuthenticator gAuth = new GoogleAuthenticator();
        return gAuth.getTotpPassword(secret);
    }
}
