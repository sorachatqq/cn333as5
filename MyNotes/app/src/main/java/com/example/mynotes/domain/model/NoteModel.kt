package com.example.mynotes.domain.model

const val NEW_NOTE_ID = -1L

data class NoteModel(
    val id: Long = NEW_NOTE_ID, // This value is used for new notes
    val name: String = "",
    val content: String = "",
    val isCheckedOff: Boolean? = null, // null represents that the note can't be checked off
    val isFavorite: Boolean = false,
    val color: ColorModel = ColorModel.DEFAULT,
    )