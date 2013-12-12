package com.hellogwt.client;

import com.google.gwt.cell.client.TextCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.*;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class UserProfile extends Composite {

    interface UserProfileUiBinder extends UiBinder<FlowPanel, UserProfile> {};
    private static UserProfileUiBinder uiBinder = GWT.create(UserProfileUiBinder.class);

    private static final List<String> STRING_LIST_EXAMPLE = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday");

    @UiField
    Image photo;
    @UiField
    Label name;
    @UiField
    Label mobile;
    @UiField
    Label email;
    @UiField
    Label web;
    @UiField
    Label bio;
    @UiField
    Button button;
    @UiField
    TextArea textArea;
    @UiField(provided = true)
    CellList<String> cellList = new CellList<String>(new TextCell());
    @UiField(provided = true)
    SimplePager pager = new SimplePager();

    @UiField
    Button more;

    private int counter = 0;
    private ListDataProvider<String> provider =  new ListDataProvider<String>(STRING_LIST_EXAMPLE);

    public UserProfile() {
        super();
        initWidget(uiBinder.createAndBindUi(this));
        handleUserCellListSection();
        prepareBaseUIElements();
    }

    /**
     * Example base UI elements
     */
    public void prepareBaseUIElements() {
        photo.setUrl("test-img.gif");
        name.setText("test text");
        email.setText("test text");
        mobile.setText("01");
        web.setText("web");
        bio.setText("bio");
        textArea.setText("Enter your text");
    }

    /**
     * Provide to handle user select cellList
     */
    private void handleUserCellListSection() {

        cellList.setRowCount(STRING_LIST_EXAMPLE.size(), true);

        // Push the data into the widget.
        cellList.setRowData(0, STRING_LIST_EXAMPLE);

        // Add a selection model to handle user selection.
        final SingleSelectionModel<String> selectionModel = new SingleSelectionModel<String>();
        cellList.setSelectionModel(selectionModel);
        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent event) {
                String selected = selectionModel.getSelectedObject();
                if (selected != null) {
                    Window.alert("You selected: " + selected);
                }
            }
        });

        //create pagination
        provider.addDataDisplay(cellList);
        pager.setDisplay(cellList);
        pager.setPageSize(3);
    }

    @UiHandler("button")
    void handleClick(ClickEvent e) {
        //for debug need to use mvn:debug, @see gwt-maven-plugin
        Window.alert("Hello, AJAX!");
    }
}
