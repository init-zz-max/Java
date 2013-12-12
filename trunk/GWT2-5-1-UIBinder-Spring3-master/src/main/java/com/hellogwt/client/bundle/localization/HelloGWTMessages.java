package com.hellogwt.client.bundle.localization;


import com.google.gwt.i18n.client.Messages;

/**
 * Created with IntelliJ IDEA.
 * User: mzavgorodny
 * Date: 9/27/13
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface HelloGWTMessages extends Messages {

    @Key("helloWorldLocalization")
    String helloWorldLocalization();

  /*  @DefaultMessage("Enter your name")
    String enterName();

    @DefaultMessage("Click Me")
    String clickMe();

    @DefaultMessage("Application Internalization Demonstration")
    String applicationTitle();

    @DefaultMessage("Hello {0}")
    String greeting(String name);*/
}
