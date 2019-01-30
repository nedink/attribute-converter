package art.nedink.hibernate;

import art.nedink.hibernate.domain.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyEntityRepository extends JpaRepository<MyEntity, Integer> {
}
