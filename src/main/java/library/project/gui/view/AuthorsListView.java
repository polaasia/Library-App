package library.project.gui.view;

import library.project.model.Author;
import library.project.model.Book;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
@Data
public class AuthorsListView {
    private JPanel mainPanel;
    private JList authorsList;
    private JScrollPane authorScroll;
    private JScrollPane bookScroll;
    private JList bookList;
    private JTextPane bookInfo;

    private void createUIComponents() {
        authorsList = new JList<Author>();
        authorScroll = new JScrollPane(authorsList);
        authorsList.setCellRenderer(new AuthorListRender());
        authorsList.setModel(new DefaultListModel<Author>());
        bookList = new JList<Book>();
        bookScroll = new JScrollPane(bookList);
        bookList.setCellRenderer(new BookListRender());
        bookList.setModel(new DefaultListModel<Book>());
        bookInfo = new JTextPane();
    }

    private class AuthorListRender extends JLabel implements ListCellRenderer<Author>{

        public AuthorListRender() {
            setOpaque(true);
        }

        @Override
        public java.awt.Component getListCellRendererComponent(JList<? extends Author> list, Author value, int index, boolean isSelected, boolean cellHasFocus) {
            String name = value.getFirstName() + " " + value.getLastName();
            setText(name);
            if(isSelected){
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            }else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }
    }

    private class BookListRender extends JLabel implements ListCellRenderer<Book> {

        public BookListRender() {
            setOpaque(true);
        }

        @Override
        public java.awt.Component getListCellRendererComponent(JList<? extends Book> list, Book value, int index, boolean isSelected, boolean cellHasFocus) {
            String name = value.getTitle();
            setText(name);
            if (isSelected) {
                setBackground(list.getSelectionBackground());
                setForeground(list.getSelectionForeground());
            } else {
                setBackground(list.getBackground());
                setForeground(list.getForeground());
            }

            return this;
        }
    }
}
