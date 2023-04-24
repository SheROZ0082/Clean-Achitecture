package com.example.CleanArchitecture.data.repository

import com.example.CleanArchitecture.data.base.BaseRepository
import com.example.CleanArchitecture.data.mapper.toEntity
import com.example.CleanArchitecture.data.mapper.toNOte
import com.example.CleanArchitecture.data.model.NoteDao
import com.example.CleanArchitecture.domain.model.NOte
import com.example.CleanArchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDAo: NoteDao
) : NoteRepository,
    BaseRepository() {

    override fun createNote(nOte: NOte) = doRequest {
        noteDAo.createNote(nOte.toEntity())
    }

    override fun getAllNotes() = doRequest {
        noteDAo.getAllNotes().map {
            it.toNOte()
        }
    }


    override fun editNote(nOte: NOte) = doRequest {
        noteDAo.editNotes(nOte.toEntity())
    }

    override fun deleteNote(nOte: NOte) = doRequest {
        noteDAo.deleteNOte(nOte.toEntity())
    }
}