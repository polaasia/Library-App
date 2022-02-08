package library.project.gui.controller;

import library.project.gui.view.AuthorsListView;

import library.project.model.Book;
import library.project.model.Creator;
import library.project.service.AuthorService;
import library.project.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorsListController {
    private final AuthorsListView view;
    private final AuthorService authorService;
    private final BookService bookService;


    public void showGUI(MainWindowController mainWindowController){
        updateAuthors();
    mainWindowController.showView(view.getMainPanel());
    }

    @PostConstruct
    public void initListeners(){
        view.getAuthorsList().addListSelectionListener(e -> {

           Creator selectedAuthor = (Creator) view.getAuthorsList().getSelectedValue();

           List<Book> books = bookService.getBooksByAuthor(selectedAuthor.getId());
           DefaultTableModel model = (DefaultTableModel) books;
//            model.removeAllElements();
//            books.forEach(model :: addElement);

//            Book selectedBook = (Book) view.getBookList().getSelectedValue();
        });


    }

    private void updateAuthors(){
        List<Creator> authors = authorService.getAllAuthors();
        DefaultListModel<Creator> model = (DefaultListModel<Creator>) view.getAuthorsList().getModel();
        model.removeAllElements();
        authors.forEach(model :: addElement);
    }
}
