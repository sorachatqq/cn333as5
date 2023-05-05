package com.example.mynotes.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ColorDbModel(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    @ColumnInfo(name = "hex") val hex: String,
    @ColumnInfo(name = "name") val name: String
) {
    companion object {
        val DEFAULT_COLORS = listOf(
            ColorDbModel(1, "#FFFFFF", " "),
            ColorDbModel(2, "#E57373", "(Work)"),
            ColorDbModel(3, "#F06292", "(Home)"),
            ColorDbModel(5, "#2196F3", "(Mobile)"),
            ColorDbModel(8, "#4CAF50", "(Family)"),
        )
        val DEFAULT_COLOR = DEFAULT_COLORS[0]
    }
}
