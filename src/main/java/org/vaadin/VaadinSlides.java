package org.vaadin;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the vaadin-slides.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vaadin-slides")
@HtmlImport("src/vaadin-slides.html")
public class VaadinSlides extends PolymerTemplate<VaadinSlides.VaadinSlidesModel> {

    /**
     * Creates a new org.vaadin.VaadinSlides.
     */
    public VaadinSlides() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between org.vaadin.VaadinSlides and vaadin-slides.html
     */
    public interface VaadinSlidesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
