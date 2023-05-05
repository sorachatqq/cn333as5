package com.example.mynotes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class NoteDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "content") val content: String,
    @ColumnInfo(name = "can_be_checked_off") val canBeCheckedOff: Boolean,
    @ColumnInfo(name = "is_checked_off") val isCheckedOff: Boolean,
    @ColumnInfo(name = "color_id") val colorId: Long,
    @ColumnInfo(name = "in_trash") val isInTrash: Boolean,
    @ColumnInfo(name = "isFavorite") val isFavorite: Boolean,

    ) {
    companion object {
        val DEFAULT_NOTES = listOf(
            NoteDbModel(1, "RW Meeting", "Prepare sample project", false, false, 1, false,true),
            NoteDbModel(2, "Bills", "", false, false, 2, false,true),
            NoteDbModel(3, "Pancake recipe", "", false, false, 3, false,true),
            NoteDbModel(4, "Workout", "", false, false, 4, false,true),
            NoteDbModel(5, "Title 5", "Content 5", false, false, 5, false,true),
            NoteDbModel(6, "Title 6", "Content 6", false, false, 6, false,true),
            NoteDbModel(7, "Title 7", "Content 7", false, false, 7, false,true),
            NoteDbModel(8, "Title 8", "Content 8", false, false, 8, false,true),
            NoteDbModel(9, "Title 9", "Content 9", false, false, 9, false,true),
            NoteDbModel(10, "Title 10", "Content 10", false, false, 10, false,true),
            NoteDbModel(11, "Title 11", "Content 11", true, false, 11, false,true),
            NoteDbModel(12, "Title 12", "Content 12", true, false, 12, false,true)
        )
    }
}
