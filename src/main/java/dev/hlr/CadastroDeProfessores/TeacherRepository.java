package dev.hlr.CadastroDeProfessores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherModel, Long> {

    Optional<TeacherModel> findByEmail(String email);

    List<TeacherModel> findByDepartment(String department);
}
