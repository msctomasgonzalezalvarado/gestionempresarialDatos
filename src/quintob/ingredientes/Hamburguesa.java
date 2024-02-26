package quintob.ingredientes;

public class Hamburguesa{
    private String presentacion;
    private String sabor;
    private int i;
    private int y;
    private Pan p;
    private Carne c;
    private Lechuga[] lechugas;
    private Jitomate[] jitomates = new Jitomate[20];

    public Hamburguesa(String tipoPan){
        p= new Pan();
        c= new Carne();
        lechugas= new Lechuga[50];

        p.setTipoPan(tipoPan);
        this.sabor="Bueno";
        this.i=0;
        this.y=0;
    }

    public void setSabor(String sabor){

        this.sabor=sabor;
    }

    public  void addJitomate(Jitomate jitomate){
        if (y<20) {
            this.jitomates[y] = jitomate;
            this.y++;
        }
        else
            System.out.println("Arreglo lleno");
    }
    public void addLechuga(Lechuga lechuga){
        if (i<50) {
            lechugas[i] = lechuga;
            this.i++;
        }
        else
            System.out.println(" el arreglo ya está lleno");
    }

    public Lechuga getLechuga(int k){
        Lechuga tmp=null;
        if (k < this.i) {
            System.out.println("Entregando la lechuga numero " + k);
            tmp = this.lechugas[k];
        }
        else
            System.out.println("Error, lechuga no existente");

        return tmp;
    }
}