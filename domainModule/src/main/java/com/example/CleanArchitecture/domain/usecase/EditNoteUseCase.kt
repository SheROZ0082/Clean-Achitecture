package com.example.CleanArchitecture.domain.usecase

import com.example.CleanArchitecture.domain.model.NOte
import com.example.CleanArchitecture.domain.repository.NoteRepository
import javax.inject.Inject

class EditNoteUseCase @Inject constructor(
    private val noteRepository: NoteRepository
) {

    fun editNOte(note: NOte) = noteRepository.editNote(note)
}