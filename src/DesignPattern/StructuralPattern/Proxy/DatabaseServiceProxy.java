package DesignPattern.StructuralPattern.Proxy;

public class DatabaseServiceProxy implements DatabaseService {

    private final RealDBService realDBService;

    public DatabaseServiceProxy(RealDBService realDBService) {
        this.realDBService = realDBService;
    }

    @Override
    public void saveData(String data) {
        System.out.println("Logging: Saving data");
        realDBService.saveData(data);
    }

    @Override
    public String fetchData() {
        System.out.println("Logging: Fetching data");
        return realDBService.fetchData();
    }
}
