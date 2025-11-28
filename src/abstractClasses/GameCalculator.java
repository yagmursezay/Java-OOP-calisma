package abstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();
    //kim inherite ediyorsa hesaplayı içermek zorunda
    //override edip kendi hesaplasını yazmak zorunda

    public final void gameOver(){ //gameCalculatoru kim kullanıyorsa gameoverı olduğu gibi kullanmak zorunda
        System.out.println("oyun bitti.");
    }
}
