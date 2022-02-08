package library.project.gui.view;


import library.project.model.Book;
import library.project.model.Creator;
import library.project.model.Ebook;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

@Component
@Data
public class AuthorsListView {
    private JPanel mainPanel;
    private JList authorsList;
    private JScrollPane authorScroll;
    private JScrollPane bookScroll;
    private JList bookList;


    private void createUIComponents() {
        authorsList = new JList<Creator>();
        authorScroll = new JScrollPane(authorsList);
        authorsList.setCellRenderer(new AuthorListRender());
        authorsList.setModel(new DefaultListModel<Creator>());
        authorsList.setFixedCellHeight(20);

        bookList = new JList<Book>();
        bookScroll = new JScrollPane(bookList);
        bookList.setCellRenderer(new BookListRender());
        bookList.setModel(new DefaultListModel<Book>());
        bookList.setFixedCellHeight(20);


    }

    private class AuthorListRender extends JLabel implements ListCellRenderer<Creator> {

        public AuthorListRender() {
            setOpaque(true);
        }

        @Override
        public java.awt.Component getListCellRendererComponent(JList<? extends Creator> list, Creator value, int index, boolean isSelected, boolean cellHasFocus) {
            String name = value.getFirstName() + " " + value.getLastName();
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

    private class BookListRender extends JLabel implements ListCellRenderer<Book> {

        public BookListRender() {
            setOpaque(true);
        }

        @Override
        public java.awt.Component getListCellRendererComponent(JList<? extends Book> list, Book value, int index, boolean isSelected, boolean cellHasFocus) {
            String name = value.getTitle();
            setText(name);
            return this;
        }
    }

}
