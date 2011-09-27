package com.desoft.smartclientgwt.datebug.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.DateRangeItem;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class DateBug implements EntryPoint
{

    /**
     * This is the entry point method.
     */
    public void onModuleLoad()
    {

        DynamicForm form = new DynamicForm();
        form.setWidth("150px");
        form.setHeight("100px");
        form.setIsGroup(true);
        form.setGroupTitle("DateBug");

        DateRangeItem item = new DateRangeItem();
        form.setFields(item);

        VLayout layout = new VLayout();
        layout.addMember(form);

        RootPanel.get().add(layout);

        layout.draw();

    }
}
