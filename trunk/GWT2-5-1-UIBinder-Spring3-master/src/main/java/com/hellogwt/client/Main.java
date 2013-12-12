package com.hellogwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.*;
import com.hellogwt.client.bundle.css.MyCssExample;

import java.util.Arrays;
import java.util.List;

/**
 * Entry app point
 */
public class Main implements EntryPoint {

    private static final List<String> DAYS = Arrays.asList(
            "Sunday",
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday");

    @Override
    public void onModuleLoad() {

        injectCssBundle();

        HelloWorldWidget helloWorld = new HelloWorldWidget();
        UserProfile userProfile = new UserProfile();

        TabLayoutPanel p = new TabLayoutPanel(0.7, Style.Unit.CM);
        p.add(userProfile, "this");
        p.add(helloWorld, "that");
        //p.add(cellListCreator.prepareList(DAYS), "cell list example");
        RootLayoutPanel.get().add(p);
    }

    private void injectCssBundle() {
        // inject css
        MyCssExample bundle = GWT.create(MyCssExample.class);
        bundle.css().ensureInjected();
    }

}