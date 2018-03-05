package cmp.sem.team8.smartattendancev1.controller;

/**
 * Created by AmmarRabie on 01/03/2018.
 */


import java.util.HashMap;

import cmp.sem.team8.smartattendancev1.models.UserModel;



/**
 * The base controller for all different implementation of the connection between users.
 * This class
 */
abstract class BaseSessionController implements ConnectionListener{


    /**
     *
     * @param userId user that want to create this session, usually this is the current user
     * @param sessionData session data in key value pairs, this should contain all not nullable data at least
     * @return the session id if it created successfully, null otherwise
     */
    String init(String userId, HashMap sessionData)
    {
        return null;
    }


    /**
     * connect to an existing session, usually it is called if the user is a student
     * @param attendee the user that want to enter the session
     * @param location location of this session, usually the location of this device, latitude,
     *                 longitude
     * @param sessionId session id to connect to, (or the secret key of this session to find it out)
     * @return
     */
    String connect(UserModel attendee, double[] location, String sessionId)
    {
        return null;
    }




    /**
     * controllers we have:
     * Session controller
     * User controller
     * Files controller
     *
     */

    /** from the user interface asbects, any controller should provide these functionality:
     * create a new session
     * enter a user into non-ended session
     * give the ability to add a new question
     * give the ability to retrieve attendance list
     * and give the ability to add some listeners on specific names on it
     * give the ability to take attendance of a user
     * give the ability to give bonus to specific name in attendance list
     * give the ability to disconnect specific user
     * give the ability to end the session
     * ...
     *
    **/
}
