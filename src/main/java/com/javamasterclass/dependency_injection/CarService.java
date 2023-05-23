package com.javamasterclass.dependency_injection;

public class CarService {
    //private CarDao carDao = new CarDao();       // tightly coupled system
    private CarDao carDao;                      // dependency

    public CarService(CarDao carDao) {
        //carDao = new CarDao();                // tightly coupled system
        this.carDao = carDao;                   // injection
    }

}
