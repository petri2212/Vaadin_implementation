package org.vaadin.example.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("") // whenever some one go to local host without specifiing additional path it excecute MainView
public class MainView extends VerticalLayout {

    public MainView() {

        Button button = new Button( "Pick me");

        DatePicker datePicker = new DatePicker("pick a date");

        HorizontalLayout layout = new HorizontalLayout(button, datePicker);
        layout.setDefaultVerticalComponentAlignment(Alignment.END);
        add(layout);

        button.addClickListener(click -> add(new Paragraph("Clicked: " + datePicker.getValue())));



    }
}
