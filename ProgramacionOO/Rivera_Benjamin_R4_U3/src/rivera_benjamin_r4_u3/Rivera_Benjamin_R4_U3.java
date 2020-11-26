/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rivera_benjamin_r4_u3;

/**
 *
 * @author Benjamin Rivera Covarrubias
 * Fecha de elaboracion: 26 de noviembre de 2020
 * Nombre de modulo: Programación orientada a objetos v2
 * Nombre del Asesor: Miguel Pérez
 */
public class Main {

    public static void main( String[] args) {
        // TODO code application logic here
        System.out.println("Tarea =)");
    }
    
    
    public class Cuenta_Base {
        public double montoActual;

        public Cuenta_Base(double apertura){
            this.montoActual = apertura;
        }

        public void depositar( double cantidad ){
            this.montoActual = this.montoActual + cantidad;
        }
    }

    public class Tarjeta_Credito extends Cuenta_Base{
        
        public Tarjeta_Credito(double cantidad){
            super(cantidad);
        }

        public void suma_interes(double cantidad){
            this.montoActual = this.montoActual - cantidad;
        }
    }

    public class Tarjeta_Debito extends Cuenta_Base{

        public Tarjeta_Debito(double cantidad){
            super(cantidad);
        }

        public void retirar(double cantidad){
            this.montoActual = this.montoActual - cantidad;
        }
    }

    public class Cuenta_Ahorro extends Cuenta_Base{

        public Cuenta_Ahorro(double cantidad){
            super(cantidad);
        }

        public void invertir(double cantidad){
            this.montoActual = this.montoActual - cantidad;
        }
    }
}

    
