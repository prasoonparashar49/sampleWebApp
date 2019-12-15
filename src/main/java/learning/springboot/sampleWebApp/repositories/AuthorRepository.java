package learning.springboot.sampleWebApp.repositories;

import learning.springboot.sampleWebApp.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {
}
