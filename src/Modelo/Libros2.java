/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

/**
 *
 * @author Mark-
 */
public class Libros2 extends Categoria {
    private int cod_libro;
    private String isbn_libro;
    private String titulo_libro;
    private int pag_libro;
    private int precio_libro;

    public Libros2() {
    }

    public Libros2(String titulo_libro, int pag_libro, int precio_libro, String nom_cate) {
        super(nom_cate);
        this.titulo_libro = titulo_libro;
        this.pag_libro = pag_libro;
        this.precio_libro = precio_libro;
    }

    public Libros2(String isbn_libro, String titulo_libro, int pag_libro, int precio_libro, String nom_cate) {
        super(nom_cate);
        this.isbn_libro = isbn_libro;
        this.titulo_libro = titulo_libro;
        this.pag_libro = pag_libro;
        this.precio_libro = precio_libro;
    }

    
    public Libros2(String titulo_libro, String nom_cate) {
        super(nom_cate);
        this.titulo_libro = titulo_libro;
    }

    public int getCod_libro() {
        return cod_libro;
    }

    public void setCod_libro(int cod_libro) {
        this.cod_libro = cod_libro;
    }

    public String getIsbn_libro() {
        return isbn_libro;
    }

    public void setIsbn_libro(String isbn_libro) {
        this.isbn_libro = isbn_libro;
    }

    public String getTitulo_libro() {
        return titulo_libro;
    }

    public void setTitulo_libro(String titulo_libro) {
        this.titulo_libro = titulo_libro;
    }

    public int getPag_libro() {
        return pag_libro;
    }

    public void setPag_libro(int pag_libro) {
        this.pag_libro = pag_libro;
    }

    public int getPrecio_libro() {
        return precio_libro;
    }

    public void setPrecio_libro(int precio_libro) {
        this.precio_libro = precio_libro;
    }
    
    
}
