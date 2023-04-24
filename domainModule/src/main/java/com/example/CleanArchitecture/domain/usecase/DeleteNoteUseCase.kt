package com.example.CleanArchitecture.domain.usecase

import com.example.CleanArchitecture.domain.model.NOte
import com.example.CleanArchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class DeleteNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun deleteNOte(nOte: NOte) = noteRepository.deleteNote(nOte)
}