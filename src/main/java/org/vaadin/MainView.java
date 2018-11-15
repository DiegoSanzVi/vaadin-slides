package org.vaadin;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        MyPresentation vaadinSlides = new MyPresentation();

        add(vaadinSlides);
    }
}
