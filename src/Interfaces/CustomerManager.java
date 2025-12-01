package Interfaces;

public class CustomerManager  {

    ICustomerDal customerDal;

    public void add(){
        //iş kodları yazılır, müşteri adı girilmiş mi, doğru mu, veriler doğru mu gibi
        customerDal.Add();
    }
}
