package rs.ac.metropolitan.cs330_dz13
interface AppRepository {
    suspend fun getAllApps(): List<App>
    suspend fun addApp(app: App)
    suspend fun updateApp(app: App)
    suspend fun deleteApp(app: App)
}
