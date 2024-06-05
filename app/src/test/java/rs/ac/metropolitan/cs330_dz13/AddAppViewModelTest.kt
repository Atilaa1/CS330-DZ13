package rs.ac.metropolitan.cs330_dz13

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runBlockingTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class AddAppViewModelTest {

    private lateinit var viewModel: AddAppViewModel

    @Before
    fun setUp() {
        viewModel = AddAppViewModel()
    }

    @Test
    fun loadCategories_success() = runBlockingTest {
        // Poziv metode za učitavanje kategorija
        viewModel.loadCategories()

        // Provera da li su kategorije postavljene kako je očekivano
        val expectedCategories = listOf(
            "Gaming", "Entertainment", "Lifestyle", "Education",
            "Business", "Finance", "Other"
        )
        assertEquals(expectedCategories, viewModel.categories.value)
    }

    @Test
    fun addApp_success() = runBlockingTest {
        // Poziv metode za dodavanje aplikacije
        viewModel.addApp(App(1, "Test App", "Phone", "Education", AppType.FREE, null, 4))

        // Provera da li je aplikacija dodata kako je očekivano
        assertEquals(true, viewModel.appAdded.value)
    }
}
