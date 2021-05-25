package ru.podshivalov.xblog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.podshivalov.xblog.entities.Task;

/**
 * @author dapodshivalov
 */
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> { }
