package ignocide.service.todo.repository;


import ignocide.service.todo.domain.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
    List<Todo> findByBoardIdAndDeletedFalse(Long boardId);

    Todo findTodoByIdAndDeletedFalse(Long todoId);
}