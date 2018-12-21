package org.vaadin;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the vaadin-slides.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("diego-slides")
@HtmlImport("frontend://src/diego-slides.html")
public class DiegoSlides extends PolymerTemplate<DiegoSlides.VaadinSlidesModel> implements HasComponents, HasStyle, HasSize {

    @Id("previous-slide-btn")
    private Button previousSlideBtn;

    @Id("next-slide-btn")
    private Button nextSlideBtn;

    /**
     * Creates a new org.vaadin.VaadinSlides.
     */
    public DiegoSlides() {
        // You can initialise any data required for the connected UI components here.
        setWidth("100%");
    }

    public DiegoSlides(Component... components) {
        this();
        add(components);
    }

    public Button getPreviousSlideBtn() {
        return previousSlideBtn;
    }

    public Button getNextSlideBtn() {
        return nextSlideBtn;
    }

    /**
     * This model binds properties between org.vaadin.VaadinSlides and vaadin-slides.html
     */
    public interface VaadinSlidesModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
