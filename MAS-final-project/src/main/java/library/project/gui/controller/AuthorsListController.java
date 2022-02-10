package library.project.gui.controller;

import library.project.gui.view.AuthorsListView;

import library.project.model.Book;
import library.project.model.Creator;
import library.project.model.Ebook;
import library.project.service.AuthorService;
import library.project.service.BookService;
import lombok.RequiredArgsConstructor;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
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

    @PostConstruct
    public void initListeners(){
        view.getAuthorsList().addListSelectionListener(e -> {

           Creator selectedAuthor = (Creator) view.getAuthorsList().getSelectedValue();

           List<Book> books = bookService.getBooksByAuthor(selectedAuthor.getId());

           DefaultListModel<Book> model = (DefaultListModel<Book>) view.getBookList().getModel();
           model.removeAllElements();
           books.forEach(model :: addElement);

        });

        view.getBookList().addListSelectionListener(e -> {
            Book selectedBook = (Book) view.getBookList().getSelectedValue();
            String title = selectedBook.getTitle();
            String language = selectedBook.getLanguage();
            Object fileFormat = selectedBook.getClass();
            Object series = selectedBook.getSeries();
            view.getDetailsTitle().setText(title);
            view.getLanguageDetails().setText(language);
            if(series != null){
                view.getSeriesDetails().setText(series.toString());

            }else{
                view.getSeriesDetails().setText("this is a standalone book");
            }
            if (fileFormat.toString().contains("Ebook")){
                view.getFileFormatDetails().setText("ebook");
            } else if (fileFormat.toString().contains("Paper")){
                view.getFileFormatDetails().setText("paperback");
            }

        });

    }

    private void updateAuthors(){
        List<Creator> authors = authorService.getAllAuthors();
        DefaultListModel<Creator> model = (DefaultListModel<Creator>) view.getAuthorsList().getModel();
        model.removeAllElements();
        authors.forEach(model :: addElement);
    }
}
