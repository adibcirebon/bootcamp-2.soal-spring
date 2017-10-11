
package com.tabeldata.soal.spring.LoadSpring.Umur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ADIB PC
 */
@Component
public class UmurSaya {
    
    @Autowired
    Umur umur;
    
    public void UmurSaya () {
        System.out.println("saya ber usia ("+umur.getUmur()+ ") tahun");
    }
    
            
    
    
}
