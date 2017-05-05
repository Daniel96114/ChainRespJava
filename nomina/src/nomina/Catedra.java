/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomina;

/**
 *
 * @author Estudiantes
 */
public class Catedra implements IAprovador{
    private IAprovador next;
    
    public IAprovador getNext(){
        return next;
    }
    
    public void solicitudNomina(String nombre){
        if (nombre.equals("catedra")){
            System.out.println("Liquidando profesor de catedra");
        }else{
            next.solicitudNomina(nombre);
        }
    }
    public void setNext(IAprovador aprovador){
        next = aprovador;
        
    }
}