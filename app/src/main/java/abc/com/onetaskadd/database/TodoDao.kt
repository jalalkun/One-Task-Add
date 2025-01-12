package abc.com.onetaskadd.database

import abc.com.onetaskadd.model.TodoModel
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TodoDao {


    @Insert()
  suspend  fun insertTask(todoModel: TodoModel):Long

    @Query("Select * From TodoModel")
    fun getAllTask():LiveData<List<TodoModel>>
}