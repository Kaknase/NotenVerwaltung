package org.htlanich.notenverwaltung.model;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface schuelerRepository extends JpaRepository<Schueler, Long>{
    List<Schueler> findBySchuelerIdContainingIgnoreCase(long id);
}
