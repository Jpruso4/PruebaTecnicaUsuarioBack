package octans.co.com.prueba.dao;

import octans.co.com.prueba.entitie.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolDao extends JpaRepository<Rol, Integer> {
}
