// 1- Pacote
package apitest;

import com.google.gson.Gson;
import entities.AccountEntity;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.net.URI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.stringContainsInOrder;


// 2- Biblioteca
// 3- Classe
public class Account {
    //Atributos

    // Instanciar Classes externas
    Gson gson = new Gson(); // Instancia o objeto de conversão classe para json

    //Métodos e funções

    //Método #1 - Criar Usuário

    @Test
    public void testCreateUser(){
        // Arrange - Configura
        AccountEntity account = new AccountEntity(); // Intancia a entidade usuario
        account.userName = "charlie202"; // Entrada e Saida (Resultado esperado)
        account.password = "P@ss0rd1";  // Entrada

        String jsonBody = gson.toJson(account); // converte a entidade account usuário no formato json

        // Act - Executa

        // Dado  - Quando - Então
        // Given - When   - then
        Response resposta = (Response) given()       // dado
                .contentType("application/json") // Tipo de conteudo
                .log().all()                     // Registre tudo
                .body(jsonBody)   //Corpo da msg que será enviada
        .when() // Quando
                .post( "https://bookstore.toolsqa.com/Account/v1/User")
                // Assert - Valida
        .then() // Então
                .log().all()        // Registra tudo que volta
                .statusCode(201) // Valide o Comunicação
                .body("username", is(account.userName))
                .extract()
        ; // fim do rest assured

        // extrair o userId (Identificação do usuário)

        String userId = resposta.jsonPath().getString("userID");
        System.out.println("UserID extraido: " + userId);


    } // fim do método de criação de usuário


    public void testGenerateToken(){
        // Configura

        // executa

        // Valida


    }// fim do método de geração de Token de identificação do usuário



}
