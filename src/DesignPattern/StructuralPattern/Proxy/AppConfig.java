package DesignPattern.StructuralPattern.Proxy;

public class AppConfig {

    public RealDBService realDatabaseService() {
        return new RealDBService();
    }

    public DatabaseService databaseService(RealDBService realDatabaseService) {
        return new DatabaseServiceProxy(realDatabaseService);
    }
}
