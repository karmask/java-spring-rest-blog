package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Author;
import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthorRepository {
    public List<Author> findAll() {
        return null;
    }

    public List<Author> saveAll(List<Author> authors) {
        return null;
    }
}