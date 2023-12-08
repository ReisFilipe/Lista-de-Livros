package br.com.reis.filipe.ListadeLivros.service;

import br.com.reis.filipe.ListadeLivros.entity.Author;
import br.com.reis.filipe.ListadeLivros.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;
    public List<Author> getAuthorList(){
        Iterable<Author> authorIterable = this.authorRepository.findAll();
        return Streamable.of(authorIterable).toList();
    }
}
