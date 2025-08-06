package PrototypeDesignPattern;

import java.util.ArrayList;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String port;
    private String importantData;

    private ArrayList<String> domains = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData()throws InterruptedException {
        Thread.sleep(5000);
        this.importantData = "Very Very Important data";
    }

    public ArrayList<String> getDomain() {
        return domains;
    }

    public void setDomain(ArrayList<String> domains) {
        this.domains = domains;
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "ip='" + ip + '\'' +
                ", port='" + port + '\'' +
                ", importantData='" + importantData + '\'' +
                ", domains=" + domains +
                '}';
    }

    //for shallow CLoning
//    @Override
//    public NetworkConnection clone() throws CloneNotSupportedException {
//        return (NetworkConnection) super.clone();
//    }

    //for deep cloning
    @Override
    public NetworkConnection clone() throws CloneNotSupportedException{
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp(this.getIp());
        networkConnection.setPort(this.getPort());
        networkConnection.setImportantData(this.getImportantData());
        for(String d: this.domains){
            networkConnection.getDomain().add(d);
        }
        return networkConnection;
    }
}
