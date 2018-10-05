package com.repositorys;

import com.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    public List<Publisher> findByBooksId(int id);
}
