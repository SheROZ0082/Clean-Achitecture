package com.example.CleanArchitecture.domain.usecase

import com.example.CleanArchitecture.domain.model.NOte
import com.example.CleanArchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class CreateNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun createNOte(nOte: NOte) = noteRepository.createNote(nOte)
}