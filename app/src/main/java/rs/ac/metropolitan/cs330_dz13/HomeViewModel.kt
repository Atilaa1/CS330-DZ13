package rs.ac.metropolitan.cs330_dz13

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {
    var repository: AppRepository? = null
    private val _apps: MutableStateFlow<List<App>> = MutableStateFlow(emptyList())
    val apps: StateFlow<List<App>> = _apps

    fun loadApps() {

        _apps.value = listOf(
            App(1, "App 1", "Phone", "Education", AppType.FREE, null, 4),
            App(2, "App 2", "Tablet", "Entertainment", AppType.PAID, null, 3),
            App(3, "App 3", "Phone", "Gaming", AppType.SUBSCRIPTION, "2024-12-31", 5)
        )
    }
}
