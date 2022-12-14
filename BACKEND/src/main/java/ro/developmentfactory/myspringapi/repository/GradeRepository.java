package ro.developmentfactory.myspringapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.developmentfactory.myspringapi.entity.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Long> {
}
