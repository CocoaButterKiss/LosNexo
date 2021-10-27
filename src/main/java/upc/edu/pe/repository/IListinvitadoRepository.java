package upc.edu.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import upc.edu.pe.entities.ListInvitado;

@Repository
public interface IListinvitadoRepository extends JpaRepository<ListInvitado, Integer> {
}