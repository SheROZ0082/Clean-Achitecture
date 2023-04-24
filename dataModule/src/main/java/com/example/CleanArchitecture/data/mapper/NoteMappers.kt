package com.example.CleanArchitecture.data.mapper

import com.example.CleanArchitecture.data.model.NoteEntity
import com.example.CleanArchitecture.domain.model.NOte

fun NOte.toEntity() = NoteEntity(
    id, title, desc
)

fun NoteEntity.toNOte() = NOte(
    id,title,desc
)