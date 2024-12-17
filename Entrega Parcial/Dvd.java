//Nome: Carlos Eduardo Martins Ferreira RA: 2576163

public abstract class Dvd {

    private  int codigo;
    private String titulo;
    private String genero;
    private int ano;
    private boolean disponivel;

    public Dvd() {
        setDisponivel(true);
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getAno() {
        return ano;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
