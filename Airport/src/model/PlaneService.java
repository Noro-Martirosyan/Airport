package model;

public class PlaneService {

    public void task1(Plane p1){
        p1.printINFO();
    }

    public void task2(Plane plane){
        if (plane.isMilitary()==true){
            System.out.println(plane.getCost());
            System.out.println(plane.getTopSpeed());
        }else{
            System.out.println(plane.getName());
            System.out.println(plane.getCountry());
        }
    }

    public Plane task3(Plane p1,Plane p2){
       if(p1.getYear()>=p2.getYear()){
           return p1;
       }
       return p2;
    }


    public Plane task4(Plane p1,Plane p2){
        if(p1.getWingSpan()>=p2.getWingSpan()){
            return p1;
        }
        return p2;
    }


    public Plane task5 (Plane p1,Plane p2,Plane p3){
        int minSEATS = 2;
        if (p1.getSeats()>=minSEATS){
            System.out.println(p1.getCountry());
        }else if(p2.getSeats()>=minSEATS){
            System.out.println(p2.getCountry());
        }
        return p3;
    }


    public void task6 (Plane [] planes){
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()==false){
                planes[i].printINFO();

            }

        }
    }
    public void task7 (Plane [] planes){
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary()==true && planes[i].getHours()>100){
                planes[i].printINFO();
            }


        }
    }


    public Plane task8(Plane [] planes){
        Plane minWeighPlane =  planes[0];
        int minWeigh = planes[0].getWeigh();
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeigh()<minWeigh){
                minWeigh = planes[i].getWeigh();
                minWeighPlane=planes[i];
            }

        }
      return minWeighPlane;

    }
}
