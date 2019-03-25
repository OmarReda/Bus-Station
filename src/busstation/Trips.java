
package busstation;


public class Trips implements Costs {

    public Trips(float distance, String destination, String type1, String type2, String type3, String date, String time) {
        this.distance = distance;
        this.destination = destination;
        this.type1 = type1;
        this.type2 = type2;
        this.type3 = type3;
        this.date = date;
        this.time = time;
    }

    

    float distance;
    String destination;
    String type1;  //internal or external
    String type2;  //non stop or one stop or many stops
    String type3;  //one way or round trip
    String date;
    String time;
    
    /////Calculate total cost of trip

    @Override
    public float totalcost(float distance,String destination,String type1,String type2,String type3) {

        float totalcost = 0;
    
    ///// for internal trips
    
          if ("internal".equalsIgnoreCase(type1) && "non stop".equalsIgnoreCase(type2) && "one way trip".equalsIgnoreCase(type3)){
          totalcost = (float) (distance * 5 * 1.75);
    }else if ("internal".equalsIgnoreCase(type1) && "non stop".equalsIgnoreCase(type2) && "round trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 2);
    }else if ("internal".equalsIgnoreCase(type1) && "one stop".equalsIgnoreCase(type2) && "one way trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 1.25);
    }else if ("internal".equalsIgnoreCase(type1) && "one stop".equalsIgnoreCase(type2) && "round trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 1.5);
    }else if ("internal".equalsIgnoreCase(type1) && "many stops".equalsIgnoreCase(type2) && "one way trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5);
    }else if ("internal".equalsIgnoreCase(type1) && "many stops".equalsIgnoreCase(type2) && "round trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 1.15);
    }
    
    
    ///// for external trips 
    
    else if ("external".equalsIgnoreCase(type1) && "non stop".equalsIgnoreCase(type2) && "one way trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 4);
    }else if ("external".equalsIgnoreCase(type1) && "non stop".equalsIgnoreCase(type2) && "round trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 4.25);
    }else if ("external".equalsIgnoreCase(type1) && "one stops".equalsIgnoreCase(type2) && "one way trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 3.5);
    }else if ("external".equalsIgnoreCase(type1) && "one stop".equalsIgnoreCase(type2) && "round trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 3.75);
    }else if ("external".equalsIgnoreCase(type1) && "many stops".equalsIgnoreCase(type2) && "one way trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 3);
    }else if ("external".equalsIgnoreCase(type1) && "many stops".equalsIgnoreCase(type2) && "round trip".equalsIgnoreCase(type3)){
        totalcost = (float) (distance * 5 * 3.25);
    }
            return totalcost;
        
    }
    
}
