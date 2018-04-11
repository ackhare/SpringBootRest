package com.example.easynotes.repository;

/**
 * Created by chetan on 11/4/18.
 */
import com.example.easynotes.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
    Note findById(Long id);
}
