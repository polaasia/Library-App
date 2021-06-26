package library.project.gui.view;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Data
@Component
public class MainWindowView extends JFrame {

    public MainWindowView() {
        setTitle("library system");
        setSize(1200, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
