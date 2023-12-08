package br.com.reis.filipe.ListadeLivros.repository;

import br.com.reis.filipe.ListadeLivros.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
