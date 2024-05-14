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
public class Fresher extends Candidates {
    private String graduation_date, gradudation_rank, education;

    public Fresher() {
    }

    public Fresher(int id, String firstName, String lastName, String birthDate, String address, String phone, String email, int type, String graduation_date, String gradudation_rank, String education) {
        super(id, firstName, lastName, birthDate, address, phone, email, type);
        this.graduation_date = graduation_date;
        this.gradudation_rank = gradudation_rank;
        this.education = education;
    }

    public String getGraduation_date() {
        return graduation_date;
    }

    public String getGradudation_rank() {
        return gradudation_rank;
    }

    public String getEducation() {
        return education;
    }

    public void setGraduation_date(String graduation_date) {
        this.graduation_date = graduation_date;
    }

    public void setGradudation_rank(String gradudation_rank) {
        this.gradudation_rank = gradudation_rank;
    }

    public void setEducation(String education) {
        this.education = education;
    }
    
    
}
