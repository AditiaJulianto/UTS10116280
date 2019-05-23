package com.julian.uts10116280.presenter;

/**
 * Nim : 10116280
 * Nama : Aditia Julianto
 * Kelas : AKB-7
 * TGL : 23/05/2019
 */

import com.julian.uts10116280.model.Teman;
import com.julian.uts10116280.model.listTeman;

public class kontakPresenter {
    listTeman list;
    public kontakPresenter(){
        list = new listTeman();
    }

    public String testTambahTeman(){
        Teman teman1 = new Teman("10116281","Andreas Rizki Rizaldi","IF-7","082240604117","andreasrr998@gmail.com");
        Teman teman2 = new Teman("10116282","Arvi Ramadhan","IF-7","9222222","aaa@aa.ch");
        list.add(teman1);
        list.add(teman2);
        Teman t = list.getLast();
        return t.getNama();
    }

    public Teman[] TampilSemua(){
        return list.getAll();
    }
}
