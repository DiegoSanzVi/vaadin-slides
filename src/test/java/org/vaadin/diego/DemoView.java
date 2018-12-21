package org.vaadin.diego;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("")
public class DemoView extends Div {

    public DemoView() {
        SlidePresenter diegoSlides = new SlidePresenter();

        // divs
        diegoSlides.add(createDiv("red"), createDiv("blue"), createDiv("yellow"));

        // grid
        Grid<String> grid = new Grid<>();

        grid.addColumn(String::toString).setHeader("name");
        grid.setItems("diego", "juan", "diego", "juan", "diego", "juan", "diego", "juan", "diego", "juan");

        diegoSlides.add(grid);

        add(diegoSlides);
    }

    private Div createDiv(String color) {
        Div div = new Div();

        div.setHeight("400px");

        div.getStyle().set("overflow", "auto").set("background-color", color);

        return div;
    }
}
