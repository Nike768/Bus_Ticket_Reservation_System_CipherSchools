public class Bus {

    private String busNumber;
    private String source;
    private String destination;
    private String operatorName;
    private int fare;

    public Bus(){

    }

    public Bus(String busNumber, String source, String destination, String operatorName, int fare) {
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.operatorName = operatorName;
        this.fare = fare;
    }

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }
}
