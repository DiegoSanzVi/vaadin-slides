import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the diego-test.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("diego-test")
@HtmlImport("src/diego-test.html")
public class DiegoTest extends PolymerTemplate<DiegoTest.DiegoTestModel> {

    /**
     * Creates a new DiegoTest.
     */
    public DiegoTest() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between DiegoTest and diego-test.html
     */
    public interface DiegoTestModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
