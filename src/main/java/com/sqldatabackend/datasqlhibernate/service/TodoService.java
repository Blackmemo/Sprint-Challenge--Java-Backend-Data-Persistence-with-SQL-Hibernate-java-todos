package com.sqldatabackend.datasqlhibernate.service;

import com.sqldatabackend.datasqlhibernate.models.Todo;

import java.util.List;

public interface TodoService
{
    Todo update(Todo todo, long id);

}
