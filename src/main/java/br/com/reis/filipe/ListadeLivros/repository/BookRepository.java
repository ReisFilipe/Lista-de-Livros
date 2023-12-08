package br.com.reis.filipe.ListadeLivros.repository;

import br.com.reis.filipe.ListadeLivros.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    @Override
    List<Book> findAll();

}
