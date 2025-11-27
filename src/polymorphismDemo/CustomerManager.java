package polymorphismDemo;

public class CustomerManager {
    private BaseLogger logger;//anne ile çalışıyoruz

    public CustomerManager(BaseLogger logger) {//constructer oluşturduk
        this.logger = logger;
    }

    public void Add(){
        System.out.println("müşteri eklendi.");
       // DatabaseLogger logger =new DatabaseLogger(); buna bağımlı olmamalı
        this.logger.log("log mesajı.");
    }

}
