package library.project.gui.controller;

import library.project.gui.view.AuthorsListView;
import library.project.model.Author;
import library.project.model.Book;
import library.project.service.AuthorService;
import library.project.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.swing.*;
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

//    @PostConstruct
//    public void initListeners(){
//        view.getAuthorsList().addListSelectionListener(e -> {
//
//            Author selectedAuthor = (Author) view.getAuthorsList().getSelectedValue();
//
////            List<Book> books = bookService.getBooksByAuthor(selectedAuthor.getId());
////            DefaultListModel<Book> model = (DefaultListModel<Book>) view.getBookList().getModel();
////            model.removeAllElements();
////            books.forEach(model :: addElement);
////
////            Book selectedBook = (Book) view.getBookList().getSelectedValue();
//        });
//

//    }

    private void updateAuthors(){
        List<Author> authors = authorService.getAllAuthors();
        DefaultListModel<Author> model = (DefaultListModel<Author>) view.getAuthorsList().getModel();
        model.removeAllElements();
        authors.forEach(model :: addElement);
    }
}
