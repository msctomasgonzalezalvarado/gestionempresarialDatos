package quintob.ingredientes;

public class Pan{

    public static String clasico="Clasico";
    public static String integral="Integral";
    public static String parmesano="Parmesano";
    private String tamannio;
    private String tipoPan;

    public void setTipoPan(String tipoPan){
        this.tipoPan= tipoPan;
    }
    public String getTipoPan(){
        return this.tipoPan;
    }
}
