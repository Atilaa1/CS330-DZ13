package rs.ac.metropolitan.cs330_dz13

interface AppDao {
    suspend fun getAllApps(): List<App>
    suspend fun insertApp(app: App)
    suspend fun updateApp(app: App)
    suspend fun deleteApp(app: App)
}
