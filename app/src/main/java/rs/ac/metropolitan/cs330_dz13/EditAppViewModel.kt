package rs.ac.metropolitan.cs330_dz13

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class EditAppViewModel : ViewModel() {
    private val _editedApp: MutableStateFlow<App?> = MutableStateFlow(null)
    val editedApp: StateFlow<App?> = _editedApp

    fun setEditedApp(app: App) {
        _editedApp.value = app
    }
}
