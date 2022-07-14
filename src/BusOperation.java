import java.util.ArrayList;
import java.util.List;

public class BusOperation {

    static List<Bus> busList = new ArrayList<>();
    public void createBus(String busNumber, String source, String destination, String operatorName, int fare)
    {
            Bus bus = new Bus(busNumber,source,destination,operatorName,fare);
            busList.add(bus);
    }

    public List<Bus> searchBus(String source, String destination){
        List<Bus> resultList = new ArrayList<>();
        for(Bus bus : busList){
            if(source.equals(bus.getSource()) && destination.equals(bus.getDestination())){
                resultList.add(bus);
            }
        }
        return resultList;
    }

   public boolean bookBus(String operatorName){
        for(Bus bus : busList) {
            if (operatorName.equals(bus.getOperatorName())){

            }
        }
        return true;
   }




}
