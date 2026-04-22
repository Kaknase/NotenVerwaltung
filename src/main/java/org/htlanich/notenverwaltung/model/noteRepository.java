package org.htlanich.notenverwaltung.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface noteRepository extends JpaRepository<Note, Long> {
}
