package Modelo;

public class Reporte {
    private String modeloeq;
    private String nomcliente;
    private String telcliente;
    private String correocliente;
    private int precioeq;
    private String tipoeq;

    public Reporte(String modeloeq, String nomcliente, String telcliente, String correocliente, int precioeq, String tipoeq) {
        this.modeloeq = modeloeq;
        this.nomcliente = nomcliente;
        this.telcliente = telcliente;
        this.correocliente = correocliente;
        this.precioeq = precioeq;
        this.tipoeq = tipoeq;
    }

    public String getModeloeq() {
        return modeloeq;
    }

    public void setModeloeq(String modeloeq) {
        this.modeloeq = modeloeq;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getTelcliente() {
        return telcliente;
    }

    public void setTelcliente(String telcliente) {
        this.telcliente = telcliente;
    }

    public String getCorreocliente() {
        return correocliente;
    }

    public void setCorreocliente(String correocliente) {
        this.correocliente = correocliente;
    }

    public int getPrecioeq() {
        return precioeq;
    }

    public void setPrecioeq(int precioeq) {
        this.precioeq = precioeq;
    }

    public String getTipoeq() {
        return tipoeq;
    }

    public void setTipoeq(String tipoeq) {
        this.tipoeq = tipoeq;
    }

    @Override
    public String toString() {
        return "Reporte{" + "modeloeq=" + modeloeq + ", nomcliente=" + nomcliente + ", telcliente=" + telcliente + ", correocliente=" + correocliente + ", precioeq=" + precioeq + ", tipoeq=" + tipoeq + '}';
    }
    
    
}
