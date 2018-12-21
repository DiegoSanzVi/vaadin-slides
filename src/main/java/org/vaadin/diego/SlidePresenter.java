package org.vaadin.diego;

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


@Tag("vaadin-slide-presenter")
@HtmlImport("frontend://src/vaadin-slide-presenter.html")
public class SlidePresenter extends PolymerTemplate<SlidePresenter.VaadinSlidesModel> implements HasComponents, HasStyle, HasSize {

    @Id("previous-slide-btn")
    private Button previousSlideBtn;

    @Id("next-slide-btn")
    private Button nextSlideBtn;

    public SlidePresenter() {
    }

    public SlidePresenter(Component... components) {
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
