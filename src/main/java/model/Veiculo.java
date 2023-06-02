/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author crist
 */
public class Veiculo {

    private String placa;
    private String marca;
    private String modelo;
    private String ano;
    private double diaria;
    private boolean disponivel;

    public Veiculo() {

    }

    public Veiculo(String placa, String marca, String modelo, String ano, double diaria, boolean disponivel) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.diaria = diaria;
        this.disponivel = disponivel;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getDiaria() {
        return this.diaria;
    }

    public void setDiaria(double diaria) {
        this.diaria = diaria;
    }

    public boolean getDisponivel() {
        return this.disponivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

}
