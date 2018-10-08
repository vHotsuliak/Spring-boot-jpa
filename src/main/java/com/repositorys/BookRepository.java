package com.repositorys;

import com.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByPublishersId(int id);

    Book findByIdAndPublishersId(Integer idBook, Integer idPublisher);
}
