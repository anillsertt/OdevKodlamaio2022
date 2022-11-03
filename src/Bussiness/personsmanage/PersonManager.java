package Bussiness.personsmanage;

import dataAccsess.IDBService;
import logger.ILoggerService;

public class PersonManager implements IPersonManager {

    IDBService idbService;
    ILoggerService iLoggerService;
    public PersonManager(ILoggerService iLoggerService){
        this.iLoggerService = iLoggerService;
    }
    public PersonManager(IDBService idbService){
        this.idbService = idbService;
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void read() {

    }
}
