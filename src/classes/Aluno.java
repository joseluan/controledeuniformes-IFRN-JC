/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author 20141064010220
 */
public class Aluno {
    private String matricula;
    private String nome;
    private String turma;

    private int strike = 0;

    public int getStrike() {
        return strike;
    }

    public void setStrike() {
        this.strike++;
    }
    public void zerarStrike() {
        this.strike = 0;
    }
    public void mudarStrike(int strike) {
        this.strike = strike;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Aluno(String matricula,String nome, String turma,int strike) {
            this.matricula = matricula;
            this.nome = nome;
            this.turma = turma;
            this.strike = strike;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
