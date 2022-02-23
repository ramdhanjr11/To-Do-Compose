package com.muramsyah.to_docompose.data.repository

import com.muramsyah.to_docompose.data.TodoDao
import com.muramsyah.to_docompose.data.models.ToDoTask
import javax.inject.Inject

class ToDoRepository @Inject constructor(private val todoDao: TodoDao) {

    fun getAllTasks() = todoDao.getAllTasks()

    fun sortByLowPriority() = todoDao.sortByLowPriority()

    fun sortByHighPriority() = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int) = todoDao.getSelectedTask(taskId)

    suspend fun addTask(toDoTask: ToDoTask) {
        todoDao.addTask(toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask) {
        todoDao.updateTask(toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask) {
        todoDao.deleteTask(toDoTask)
    }

    suspend fun deleteAllTask() {
        todoDao.deleteAllTasks()
    }

    fun searchDatabase(searchQuery: String) = todoDao.searchDatabase(searchQuery)

}