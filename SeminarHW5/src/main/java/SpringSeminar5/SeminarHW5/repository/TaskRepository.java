package SpringSeminar5.SeminarHW5.repository;

import SpringSeminar5.SeminarHW5.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> getTasksByStatus(Task.Status status);
}
