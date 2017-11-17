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
        Pattern pattern = Pattern.compile("[\\W]");
        matcher = pattern.matcher(username);

        //STEP 1: Verifying that the username is valid
        if(username.length() > 4 && matcher.find()){
            errorState = 1;
        }

        //STEP 2: Verifying that the username is not in use
        if(errorState==0){
            //TODO: connecting with firebase and verifying that
        }

        return errorState;
    }


    public static byte verifyEmail(String email){
        byte errorState;
        Matcher matcher;

        /**
         * errorState - 0 everything is correct, don't worry ;)
         * errorState - 1 email is not correct
         * errorState - 2 username is used already :(
         */
        errorState = 0;
        Pattern pattern = Pattern.compile("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,16}");
        matcher = pattern.matcher(email);

        //STEP 1: Verifying that the username is valid
        if(!matcher.find()){
            errorState = 1;
        }

        //STEP 2: Verifying that the username is not in use
        if(errorState==0){
            //TODO: connecting with firebase and verifying that
        }

        return errorState;
    }

    public static byte verifyPassword(String pass1, String pass2){
        byte errorState;
        Matcher matcher;
        Pattern pattern;

        /**
         * errorState - 0 everything is correct, don't worry ;)
         * errorState - 1 password is not correct
         * errorState - 2 passwords not match each other:(
         */
        errorState = 0;
        pattern = Pattern.compile("[a-zA-Z]+[1-9]+");
        matcher = pattern.matcher(pass1);

        //STEP 1: verifying that the pass1 is correct
        if(pass1.length()<8 || !matcher.find()){
            errorState = 1;
        }

        //STEP 2: if it's correct, then match it with the pass2
        if(errorState == 0){
            if(!pass1.equals(pass2)){
                errorState = 2;
            }
        }

        return errorState;
    }
}
