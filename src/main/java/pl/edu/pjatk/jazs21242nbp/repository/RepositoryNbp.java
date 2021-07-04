package pl.edu.pjatk.jazs21242nbp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.edu.pjatk.jazs21242nbp.model.DatabaseEntrace;

public interface RepositoryNbp extends JpaRepository<DatabaseEntrace, Long> {


}
