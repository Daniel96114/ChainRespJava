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
public class Liquidador implements IAprovador{
    private IAprovador next;
    
    public IAprovador getNext(){
        return next;
    }
    
    public void solicitudNomina(String nombre){
        Planta planta = new Planta();
        this.setNext(planta);
        
        Catedra catedra = new Catedra();
        planta.setNext(catedra);
        
        Monitor monitor = new Monitor();
        catedra.setNext(monitor);
        
        Default default1 = new Default();
        monitor.setNext(default1);
        
        
        
        next.solicitudNomina(nombre);
    }
    
    public void setNext(IAprovador aprovador){
        next = aprovador;
    }
}
