package com.jnoma.purchaselist.Helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by alvar on 17/11/2017.
 */

public class RegisterHelper {

    public static byte verifyUsername(String username){
        byte errorState;
        Matcher matcher;

        /**
         * errorState - 0 everything is correct, don't worry ;)
         * errorState - 1 username is not correct, is too long or has some strange character
         * errorState - 2 username is used already :(
         */
        errorState = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z_0-9]");
        matcher = pattern.matcher(username);

        //STEP 1: Verifying that the username is valid
        if(!(username.length()>8) || !matcher.matches()){
            errorState = 1;
        }

        //STEP 2: Verifying that the username is not in use
        if(errorState==0){
            //TODO: connecting with firebase and verifying that
        }

        return errorState;
    }
}
