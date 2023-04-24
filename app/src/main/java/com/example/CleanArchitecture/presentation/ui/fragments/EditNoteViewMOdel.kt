package com.example.CleanArchitecture.presentation.ui.fragments

import androidx.lifecycle.MutableLiveData
import com.example.CleanArchitecture.domain.model.NOte
import com.example.CleanArchitecture.domain.usecase.CreateNoteUseCase
import com.example.CleanArchitecture.domain.usecase.EditNoteUseCase
import com.example.CleanArchitecture.presentation.ui.base.BaseViewModel
import com.example.CleanArchitecture.presentation.utils.UIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class EditNoteViewMOdel @Inject constructor(
    private val createNoteUseCase: CreateNoteUseCase,
    private val editNoteUseCase: EditNoteUseCase,
):BaseViewModel() {
    private val _createNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val createNoteState = _createNoteState.asStateFlow()

    private val _editNoteState = MutableStateFlow<UIState<Unit>>(UIState.Empty())
    val editNoteState = _editNoteState.asStateFlow()

    val loading = MutableLiveData<Boolean>()

    fun addNote(note: NOte) {
        createNoteUseCase.createNOte(note).collectData(_createNoteState)
    }

    fun editNote(note: NOte){
              editNoteUseCase.editNOte(note).collectData(_editNoteState)
        }
    }