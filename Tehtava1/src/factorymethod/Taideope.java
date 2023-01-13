package factorymethod;

public class Taideope extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Kahvi();
    }

}
