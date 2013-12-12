package com.hellogwt.client.bundle.css;

import com.google.gwt.core.client.GWT;
import com.hellogwt.client.bundle.localization.HelloGWTMessages;

/**
 * Created with IntelliJ IDEA.
 * User: mzavgorodny
 * Date: 9/27/13
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class BundleFactory {

    public static MyCssExample MY_BUNDLE = GWT.create(MyCssExample.class);

    public static MyCssResource createMyCssResource(){
        return MY_BUNDLE.css();
    }
}
