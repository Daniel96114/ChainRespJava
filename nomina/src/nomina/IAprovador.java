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
public interface IAprovador {
    public void setNext(IAprovador aprovador);
    public IAprovador getNext();
    public void solicitudNomina(String nombre);
    
    
}
