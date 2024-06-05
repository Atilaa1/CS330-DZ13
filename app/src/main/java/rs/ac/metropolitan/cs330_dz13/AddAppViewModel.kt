package rs.ac.metropolitan.cs330_dz13

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class AddAppViewModel : ViewModel() {
    private val _categories: MutableStateFlow<List<String>> = MutableStateFlow(emptyList())
    val categories: StateFlow<List<String>> = _categories

    private val _appAdded: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val appAdded: StateFlow<Boolean> = _appAdded

    fun loadCategories() {
        _categories.value = listOf(
            "Gaming", "Entertainment", "Lifestyle", "Education",
            "Business", "Finance", "Other"
        )
    }

    fun addApp(app: App) {

        _appAdded.value = true
    }
}
