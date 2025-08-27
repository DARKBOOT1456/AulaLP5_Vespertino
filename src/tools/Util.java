/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author u10918857104
 */
public class Util {
    public static void habilitar(boolean valor,JComponent ... components){
        for (int i = 0; i< components.length; i++){
            components[i].setEnabled(valor);
        
    }
        
    }
    public static void limpar(JComponent ... componentes){
        for (int i = 0; i < componentes.length; i++) {
            ((JtextField) componentes[i]).setText("");
            
        }
    }
}
