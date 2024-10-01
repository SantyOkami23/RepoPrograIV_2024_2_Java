package org.ciaf.ejerciciosencapsulamiento;

public class CuentaBancaria {
    private Double saldo;
    private String nombreCliente;

    public CuentaBancaria(double saldoInicial, String nombreCliente) {
        this.nombreCliente= nombreCliente;
        if (saldoInicial >=0){
            this.saldo= saldoInicial;
        }else{
            this.saldo = 0.0;
            System.out.println("El saldo Inicial no puede ser negativo, se ha establecido a 0");
        }
    }
    public void depositar(double monto){
        if (monto > 0){
            saldo+=monto;
            System.out.println("Se han depositado" +monto+". Nuevo saldo:"+saldo);
        }else{
            System.out.println("el monto a depositar debe ser mayor a 0.");
        }
    }
    public void retirar(double monto){
        if (monto > 0){
            if (monto <= saldo){
                saldo -= monto;
                System.out.println("Se han retirado"+ monto +". El nuevo saldo es"+ saldo);
            }else{
                System.out.println("Fondos insuficientes. No se puede retirar" + monto);
            }
        }
    }

}

