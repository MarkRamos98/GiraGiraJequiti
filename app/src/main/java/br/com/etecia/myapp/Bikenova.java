package br.com.etecia.myapp;

public class Bikenova {
    private String titulo;
    private int imagem;

    //construtor da clase

    public Bikenova(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }
    //metodo de acesso get e set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
