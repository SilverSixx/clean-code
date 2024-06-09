package DesignPattern.StructuralPattern.Proxy;

public class RealDBService implements DatabaseService {
    @Override
    public void saveData(String data) {
        System.out.println("Saving data: " + data);
    }

    @Override
    public String fetchData() {
        return "Fetched data";
    }
}

