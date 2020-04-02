package ru.alfastrah;

import javax.swing.*;
public class Main {

    public static void main(String[] args) {



        JOptionPane.showMessageDialog(null, "Оценка длительности разработки задач по системе PERT.","Окно приветствия",JOptionPane.INFORMATION_MESSAGE);

        String optimism = JOptionPane.showInputDialog(null, "Оптимистическая оценка: ","Шаг один",JOptionPane.INFORMATION_MESSAGE);
        String normal = JOptionPane.showInputDialog(null, "Номинальая оценка: ","Шаг два",JOptionPane.INFORMATION_MESSAGE);
        String pessimism = JOptionPane.showInputDialog(null, "Негативная оценка: ","Шаг три",JOptionPane.INFORMATION_MESSAGE);

        float opt = Float.parseFloat(optimism);
        float nrm = Float.parseFloat(normal);
        float pes = Float.parseFloat(pessimism);

        float PERT = (opt + 4 * nrm + pes) / 6;

        JOptionPane.showMessageDialog(null, "Ожидаемая продолжительность: " + PERT,"Итого",JOptionPane.INFORMATION_MESSAGE);


    }

 }
