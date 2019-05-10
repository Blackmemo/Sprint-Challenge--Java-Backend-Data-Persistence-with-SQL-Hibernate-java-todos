package com.sqldatabackend.datasqlhibernate.service;

import com.sqldatabackend.datasqlhibernate.models.Todo;
import com.sqldatabackend.datasqlhibernate.repos.TodoRepository;
import com.sqldatabackend.datasqlhibernate.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Service(value = "todoService")
public class TodoServiceImpl implements TodoService
{
    @Autowired
    private TodoRepository todoRepos;

    @Transactional
    @Override
    public Todo update(Todo todo, long id)
    {
        Todo currentTodo = todoRepos.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Long.toString(id)));
        if (todo.getDescription() != null)
        {
            currentTodo.setDescription(todo.getDescription());
        }

        return todoRepos.save(currentTodo);
    }
}
