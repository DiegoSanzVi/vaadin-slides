package org.vaadin;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vaadin-slides.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("my-presentation")
@HtmlImport("src/my-presentation.html")
public class MyPresentation extends PolymerTemplate<MyPresentation.MyPresentationModel> {

    /**
     * Creates a new org.vaadin.VaadinSlides.
     */
    public MyPresentation() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between org.vaadin.VaadinSlides and vaadin-slides.html
     */
    public interface MyPresentationModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
