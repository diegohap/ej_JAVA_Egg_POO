package Ej5.model;

import java.util.UUID;

public class Cuenta {
    private UUID id;
    private Integer dni;
    private Double balance;


    public Cuenta(Integer dni) {
        this.id = UUID.randomUUID();
        this.dni = dni;
        this.balance = 0d;
    }

    public void deposit(Double mount) {
        this.balance += mount;
    }

    public void withdrawl(Double mount){
        this.balance -=mount;
    }
    public void fastWithdrawl(Double mount){
        if(mount < this.balance*0.2)
            this.balance -=mount;
    }
    public String getId() {
        return id.toString();
    }

    public void setId(String id) {
        this.id = UUID.fromString(id);
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String consultarDatos(){
        return toString();
    }

    @Override
    public String toString() {
        return "id= " + id + '\'' +
               ", dni= " + dni;
    }
}
