package service.bookeService;

import config.ConnectionSingleton;
import model.Book;
import model.Category;
import service.categoryService.CategoryService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookService implements IBookService{
    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<>();
        Connection connection = ConnectionSingleton.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from book");
            ResultSet rs =statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
//                List<Category> categories = CategoryService.findAllCategoryForOneBook(id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public boolean save(Book p, int[] arr) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean edit(Book book, int[] arr) {
        return false;
    }
}
