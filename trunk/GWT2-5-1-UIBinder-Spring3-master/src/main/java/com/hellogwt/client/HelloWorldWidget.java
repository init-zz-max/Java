package com.hellogwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;
import com.hellogwt.client.bundle.localization.HelloGWTMessages;

/**
 * Example UIBinder world
 */
public class HelloWorldWidget extends Composite {

    interface MyUiBinder extends UiBinder<Widget, HelloWorldWidget> {};
    private static MyUiBinder uiBinder = GWT.create(MyUiBinder.class);

    //localization example
    private HelloGWTMessages messages = GWT.create(HelloGWTMessages.class);

    @UiField
    ListBox listBox;

    @UiField
    Label label;

    public HelloWorldWidget() {
        initWidget(uiBinder.createAndBindUi(this));
        label.setText(messages.helloWorldLocalization());
        listBox.addItem("one");
        listBox.addItem("two");
        listBox.addItem("three");
        listBox.addItem("for");
        listBox.addItem("fife");
    }
}
