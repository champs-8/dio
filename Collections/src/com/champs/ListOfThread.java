package com.champs;

import java.util.ArrayList;
import java.util.List;

public class ListOfThread {

    private List<Thread> listThreads;

    //constructor
    public ListOfThread(){
        this.listThreads = new ArrayList<>();
    };


    public void adicionarThread(String description){
        listThreads.add(new Thread(description));
    }; //adiciona a tarefa com uma descrição

    public void removeThread(String description){
        List<Thread> threadsForRemove = new ArrayList<>();

        for(Thread thread : listThreads){
            if (thread.getDescription().equalsIgnoreCase(description)){
                threadsForRemove.add(thread);
            }
        } //nesse caso, aqui a utilização do EQUALS está correto
        listThreads.removeAll(threadsForRemove); //irá remover todas as tarefas que estiverem nessa list
    }; //remove uma tarefa com base na descrição

    public int numberTotalThreads(){
        return listThreads.size(); //retorna o tamanho.
    }; //numero total de tarefas na lista

    public void descriptionsThreads(){
        System.out.println(listThreads);

    }; //retorna uma lista com descrição das tarefas

    public static void main(String[] args) {
        ListOfThread listOfThread = new ListOfThread();

        listOfThread.adicionarThread("Playing football");
        listOfThread.adicionarThread("eat lanch");
        listOfThread.adicionarThread("eat lanch");
        System.out.println("listOfThread = " + listOfThread.numberTotalThreads());

        listOfThread.removeThread("eat lanch");
        System.out.println("listOfThread = " + listOfThread.numberTotalThreads());

        listOfThread.descriptionsThreads();

    }
}
