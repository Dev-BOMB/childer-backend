package dev.childer.childerbackend.repositories;

import dev.childer.childerbackend.models.EvaluationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface EvaluationRepository extends JpaRepository<EvaluationModel, Long> {


}
