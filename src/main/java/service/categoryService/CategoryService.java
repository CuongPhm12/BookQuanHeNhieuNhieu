package service.categoryService;

import config.ConnectionSingleton;
import model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CategoryService implements ICategoryService{
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryService();
List<Category> categories = categoryService.findAll();
        for (Category x : categories
             ) {
            System.out.println(x);
        }
    }
    @Override
    public List<Category> findAll() {
        Connection connection = ConnectionSingleton.getConnection();
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement("select * from category");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                Category category = new Category(id,name,description);
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return categories;
    }

    @Override
    public Category findById(int id) {
        return null;
    }

    @Override
    public boolean save(Category p, int[] arr) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean edit(Category category, int[] arr) {
        return false;
    }
}
