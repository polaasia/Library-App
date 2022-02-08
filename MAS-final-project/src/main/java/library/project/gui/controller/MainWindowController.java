package library.project.gui.controller;


import library.project.gui.view.MainWindowView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;

@Controller
@RequiredArgsConstructor
public class MainWindowController {
    private final MainWindowView view;
    private final AuthorsListController authorsListController;

    public void showWindow(){
        view.setVisible(true);
    }

    @PostConstruct
    private void initListeners(){
        authorsListController.showGUI(this);

    }


    public void showView(JPanel viewToShow){
        view.getContentPane().removeAll();
        view.getContentPane().add(viewToShow);
        view.revalidate();
        view.repaint();
    }
}
