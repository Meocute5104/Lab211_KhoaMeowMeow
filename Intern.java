/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Candidates;

/**
 *
 * @author MSII
 */
public class Intern extends Candidates {
    private String majors;
    private int semester;
    private String uniName;

    public Intern() {
    }

    public Intern(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type, String majors, int semester, String uniName) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.majors = majors;
        this.semester = semester;
        this.uniName = uniName;
    }

    public String getMajors() {
        return majors;
    }

    public int getSemester() {
        return semester;
    }

    public String getUniName() {
        return uniName;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }
    
    
}
