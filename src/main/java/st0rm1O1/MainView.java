package st0rm1O1;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("")
public class MainView extends VerticalLayout {
    public MainView() {
        var question = new TextField();
        var ask = new Button("Ask");
        var answer = new Paragraph();
        ask.addClickListener(e -> answer.setText(question.getValue()));
        add(new HorizontalLayout(question, ask), answer);
    }
}
