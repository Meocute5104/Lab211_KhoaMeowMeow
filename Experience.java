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
public class Experience extends Candidates {
    private int expInYear;
    private String professionalSkill;

    public Experience() {
    }

    public Experience(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type, int expInYear, String professionalSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.expInYear = expInYear;
        this.professionalSkill = professionalSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public String getProfessionalSkill() {
        return professionalSkill;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public void setProfessionalSkill(String professionalSkill) {
        this.professionalSkill = professionalSkill;
    }
    
    
}
