package pl.edu.pjatk.jazs21242nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.pjatk.jazs21242nbp.model.DatabaseEntrace;

@Repository
public interface RepositoryNbp extends JpaRepository<DatabaseEntrace, Long> {
}
