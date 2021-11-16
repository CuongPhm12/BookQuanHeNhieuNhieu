package service.bookeService;

import model.Book;
import service.IService;

import java.util.List;

public interface IBookService extends IService<Book> {
    @Override
    List<Book> findAll();

    @Override
    Book findById(int id);

    @Override
    boolean save(Book p, int[] arr);

    @Override
    boolean delete(int id);

    @Override
    boolean edit(Book book, int[] arr);
}
