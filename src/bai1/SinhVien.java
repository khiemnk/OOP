/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author MyPC
 */
public class SinhVien {
    private String code;
    private String name;
    private String room;
    private String major;

    public SinhVien(){}
    
    public SinhVien(String code, String name, String room, String major) {
        this.code = code;
        this.name = name;
        this.room = room;
        this.major = major;
    }
    
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getRoom() {
        return room;
    }

    public String getMajor() {
        return major;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Ma sinh vien : " + code + "\n"
                + "Ten : " + name + "\n"
                + "Lop : " + room + "\n"
                +"Major : " + major +"\n";
    }
    
}
