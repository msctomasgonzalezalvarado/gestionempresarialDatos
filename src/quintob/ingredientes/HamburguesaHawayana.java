package quintob.ingredientes;

public class HamburguesaHawayana extends Hamburguesa{
    private Pinnia p1[];
    private int i;

    public HamburguesaHawayana(){
        super("Clasica");
        p1= new Pinnia[5];
        i=0;
    }
    public void addPinnia(Pinnia p1){
        this.p1[i]=p1;
        i++;
    }


}
