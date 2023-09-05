package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int epdisodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpsodios;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpdisodiosPorTemporada() {
        return epdisodiosPorTemporada;
    }

    public void setEpdisodiosPorTemporada(int epdisodiosPorTemporada) {
        this.epdisodiosPorTemporada = epdisodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodios() {
        return minutosPorEpsodios;
    }

    public void setMinutosPorEpsodios(int minutosPorEpsodios) {
        this.minutosPorEpsodios = minutosPorEpsodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * epdisodiosPorTemporada * minutosPorEpsodios;
    }

    @Override
    public String toString() {
        return "Série: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
