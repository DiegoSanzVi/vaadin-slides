package org.vaadin;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        DiegoSlides diegoSlides = new DiegoSlides();

        Div a = createDiv("red");

        Div div = new Div();

        div.setWidth("100%");
        div.setHeight("50%");

        a.add(div);
        diegoSlides.add(a,createDiv("blue"),createDiv("yellow"));

        Grid<String> grid = new Grid<>();

        grid.addColumn(String::toString).setHeader("title");
        grid.setItems("diego","juan","diego","juan","diego","juan","diego","juan","diego","juan");
        diegoSlides.add(grid);

        add(diegoSlides);
    }


    private Div createDiv(String color) {
        Div div = new Div();

        div.setWidth("400px");
        div.setHeight("400px");

        div.getStyle().set("overflow","auto").set("background-color",color);

        return div;
    }
}
