package service.categoryService;

import model.Category;
import service.IService;

import java.util.List;

public interface ICategoryService extends IService<Category> {
    @Override
    List<Category> findAll();

    @Override
    Category findById(int id);

    @Override
    boolean save(Category p, int[] arr);

    @Override
    boolean delete(int id);

    @Override
    boolean edit(Category category, int[] arr);
}
