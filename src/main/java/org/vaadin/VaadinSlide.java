package org.vaadin;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vaadin-slides.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("vaadin-slide")
@HtmlImport("src/vaadin-slide.html")
public class VaadinSlide extends PolymerTemplate<VaadinSlide.VaadinSlideModel> implements HasComponents,HasSize,HasStyle {

    /**
     * Creates a new org.vaadin.VaadinSlides.
     */
    public VaadinSlide() {
        // You can initialise any data required for the connected UI components here.
    }

    public VaadinSlide(Component... components) {
        this();
        add(components);
    }

    public VaadinSlide(String width, String height) {
        this();
        setHeight(height);
        setWidth(width);
    }

    public VaadinSlide(String width, String height,Component... components) {
       this(width,height);
       add(components);
    }


    /**
     * This model binds properties between org.vaadin.VaadinSlides and vaadin-slides.html
     */
    public interface VaadinSlideModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
