/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adib.spring.adb.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Tiket" , schema="tour")
public class Tiket {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "jadwal", nullable = false)
    private Date jadwal;

    @OneToOne
    @JoinColumn(name = "id_penumpang", nullable = false)
    private Penumpang penumpang;

    @OneToOne
    @JoinColumn(name = "id_travel", nullable = false)
    private Travel travel;

}
