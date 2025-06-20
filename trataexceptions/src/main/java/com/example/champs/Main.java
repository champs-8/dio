package com.example.champs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import com.example.champs.dao.UserDAO;
import com.example.champs.model.UserModel;

public class Main {
    static Scanner sc = new Scanner(System.in);
    
    private final static UserDAO dao = new UserDAO();
    
    public static void main(String[] args) {

        
        
        while (true) {
            
            System.out.println("=== Selecione uma opção: ===");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Buscar usuário por ID");
            System.out.println("3 - Listar usuários");
            System.out.println("4 - Atualizar usuário");
            System.out.println("5 - Excluir usuário");
            System.out.println("6 - Sair");
    
            int inputOption = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha


            MenuOption selectOption = MenuOption.values()[inputOption - 1];
            switch (selectOption) {
                case SAVE -> {
                    var user = requestToSave();
                    dao.save(user);
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;
                }
                case FIND_BY_ID -> {
                    var userId = requestId();
                    dao.findById(userId);
                    System.out.println("Usuário encontrado: " + dao.findById(userId));
                }
                case FIND_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Lista de usuários:");
                    users.forEach(System.out::println);
                }
                case UPDATE -> {
                    var user = requestToUpdate();
                    dao.update(user);
                    System.out.println("Usuário atualizado com sucesso!");
                    break;
                }
                case DELETE -> {
                    var delete = requestId();
                    dao.delete(delete);
                    System.out.println("Usuário excluído com sucesso!");
                    break;
                }
                case EXIT -> {
                    System.out.println("Saindo do programa...");
                    // Fechar o scanner no final do programa
                    sc.close();
                    return;
                }
            }
        }
    }

    
    private static UserModel requestToSave(){
        
        System.out.println("=== Digite as informações do usuário ===");
        
        System.out.println("Digite o nome do usuário");
        String name = sc.next();
        
        System.out.println("Digite o email do usuário");
        String email = sc.next();

        System.out.println("Digite o nascimento do usuário: (dd/MM/yyyy)");
        String birthdayStr = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("dd/MM/yyyy");


        // Converte a string de data para OffsetDateTime
        LocalDate birthday = LocalDate.parse(birthdayStr, formatter);

        return new UserModel(0L, name, email, birthday);
    }


    private static UserModel requestToUpdate(){
        
        System.out.println("=== Digite as informações do usuário ===");

        System.out.println("Digite o ID do usuário");
        Long id = sc.nextLong();
        sc.nextLine(); // Consumir a nova linha
        
        System.out.println("Digite o nome do usuário");
        String name = sc.next();
        
        System.out.println("Digite o email do usuário");
        String email = sc.next();

        System.out.println("Digite o nascimento do usuário: (dd/MM/yyyy)");
        String birthdayStr = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter
        .ofPattern("dd/MM/yyyy");
        // Converte a string de data para LocalDate
        LocalDate birthday = LocalDate.parse(birthdayStr, formatter);

        return new UserModel(id, name, email, birthday);
    }

    private static long requestId(){
        System.out.println("Digite o ID do usuário: ");
        return sc.nextLong();
    }
}